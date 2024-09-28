class revisit_dict:

    complex_nested_dict = {
        "company": {
            "departments": {
                "engineering": {
                    "teams": {
                        "backend": {
                            "employees": [
                                {"name": "Alice", "position": "Senior Developer", "salary": 120000},
                                {"name": "Bob", "position": "Junior Developer", "salary": 80000},
                            ],
                            "projects": {
                                "system_architecture": {
                                    "status": "active",
                                    "deadline": "2024-12-01",
                                    "budget": 500000,
                                },
                                "api_development": {
                                    "status": "completed",
                                    "deadline": "2023-08-15",
                                    "budget": 200000,
                                }
                            }
                        },
                        "frontend": {
                            "employees": [
                                {"name": "Charlie", "position": "Lead Designer", "salary": 100000},
                                {"name": "David", "position": "UI/UX Designer", "salary": 75000},
                            ],
                            "projects": {
                                "redesign": {
                                    "status": "active",
                                    "deadline": "2024-04-30",
                                    "budget": 300000,
                                }
                            }
                        }
                    }
                },
                "marketing": {
                    "teams": {
                        "social_media": {
                            "employees": [
                                {"name": "Eve", "position": "Social Media Manager", "salary": 70000},
                            ],
                            "projects": {
                                "instagram_campaign": {
                                    "status": "completed",
                                    "budget": 100000,
                                }
                            }
                        },
                        "content": {
                            "employees": [
                                {"name": "Frank", "position": "Content Writer", "salary": 60000},
                            ],
                            "projects": {
                                "blog_series": {
                                    "status": "active",
                                    "budget": 50000,
                                }
                            }
                        }
                    }
                }
            },
            "CEO": {
                "name": "Grace",
                "salary": 250000
            }
        }
    }
