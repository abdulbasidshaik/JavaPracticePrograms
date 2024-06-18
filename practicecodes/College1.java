package com.wipro.practicecodes;

	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Comparator;
	import java.util.Date;

	public class College1 implements Comparable<College1> {
	    private String name;
	    private String website;
	    private String mobile;
	    private String founder;
	    private Integer numberOfDept;
	    private String location;
	    private Date startingDate;

	    // Simple date format to parse the date string
	    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

	    public College1(String name, String website, String mobile, String founder, Integer numberOfDept, String location, Date startingDate) {
	        this.name = name;
	        this.website = website;
	        this.mobile = mobile;
	        this.founder = founder;
	        this.numberOfDept = numberOfDept;
	        this.location = location;
	        this.startingDate = startingDate;
	    }

	    // Getters and Setters
	    public String getName() { return name; }
	    public String getWebsite() { return website; }
	    public String getMobile() { return mobile; }
	    public String getFounder() { return founder; }
	    public Integer getNumberOfDept() { return numberOfDept; }
	    public String getLocation() { return location; }
	    public Date getStartingDate() { return startingDate; }

	    // Comparable implementation to sort by name
	    @Override
	    public int compareTo(College1 other) {
	        return this.name.compareTo(other.name);
	    }

	    // Static method to create a College from a CSV string
	    public static College1 createCollege(String detail) {
	        try {
	            String[] parts = detail.split(",");
	            Date startDate = dateFormat.parse(parts[6].trim());
	            Integer numberOfDepartments = Integer.parseInt(parts[4].trim());
	            return new College1(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(), numberOfDepartments, parts[5].trim(), startDate);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }

	    // Override toString method to fit the specified print format
	    @Override
	    public String toString() {
	        return String.format("%-15s %-20s %-15s %-15s %-20d %-15s %s", name, website, mobile, founder, numberOfDept, location, dateFormat.format(startingDate));
	    }
	}

	// Comparator to sort by starting date
	class StartingDateComparator implements Comparator<College> {
	    @Override
	    public int compare(College o1, College o2) {
	        return o1.getStartingDate().compareTo(o2.getStartingDate());
	    }
	}

	// Comparator to sort by number of departments
	class DepartmentComparator implements Comparator<College> {
	    @Override
	    public int compare(College o1, College o2) {
	        return Integer.compare(o1.getNumberOfDept(), o2.getNumberOfDept());
	    }
	}

