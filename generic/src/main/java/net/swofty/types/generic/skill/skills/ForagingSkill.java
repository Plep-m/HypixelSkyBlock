package net.swofty.types.generic.skill.skills;

import net.minestom.server.item.Material;
import net.swofty.types.generic.region.RegionType;
import net.swofty.types.generic.skill.SkillCategory;
import net.swofty.types.generic.user.statistics.ItemStatistic;

import java.util.List;

public class ForagingSkill extends SkillCategory {
    @Override
    public Material getDisplayIcon() {
        return Material.JUNGLE_SAPLING;
    }

    @Override
    public String getName() {
        return "Foraging";
    }

    @Override
    public List<String> getDescription() {
        return List.of(
                "§7Cut trees and forage for other",
                "§7plants to earn Foraging XP!"
        );
    }

    @Override
    public SkillReward[] getRewards() {
        return List.of(
                new SkillReward(1, 50,
                        new RegionReward() {
                            @Override
                            public RegionType getRegion() {
                                return RegionType.BIRCH_PARK;
                            }
                        },
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 100;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(2, 125,
                        new RegionReward() {
                            @Override
                            public RegionType getRegion() {
                                return RegionType.SPRUCE_WOODS;
                            }
                        },
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 250;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(3, 200,
                        new RegionReward() {
                            @Override
                            public RegionType getRegion() {
                                return RegionType.DARK_THICKET;
                            }
                        },
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 500;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(4, 300,
                        new RegionReward() {
                            @Override
                            public RegionType getRegion() {
                                return RegionType.SAVANNA_WOODLAND;
                            }
                        },
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 750;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(5, 500,
                        new RegionReward() {
                            @Override
                            public RegionType getRegion() {
                                return RegionType.JUNGLE_ISLAND;
                            }
                        },
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(6, 750,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 2000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(7, 1000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 3000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(8, 1500,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 4000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(9, 2000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 5000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(10, 3500,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 5;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 7500;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(11, 5000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 10000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(12, 7500,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 15000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(13, 10000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 20000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(14, 15000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 25000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 1D;
                            }
                        }
                ),
                new SkillReward(15, 20000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 30000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(16, 30000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 40000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(17, 50000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 50000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(18, 75000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 65000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(19, 100000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 80000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(20, 200000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 100000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(21, 300000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 125000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(22, 400000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 150000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(23, 500000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 175000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(24, 600000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 200000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(25, 700000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 10;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 225000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(26, 800000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 250000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(27, 900000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 275000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(28, 1000000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 300000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(29, 1100000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 325000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(30, 1200000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 350000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(31, 1300000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 375000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(32, 1400000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 400000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(33, 1500000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 425000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(34, 1600000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 450000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(35, 1700000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 475000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(36, 1800000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 500000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(37, 1900000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 550000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(38, 2000000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 600000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(39, 2100000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 650000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(40, 2200000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 700000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(41, 2300000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 750000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(42, 2400000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 800000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(43, 2500000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 850000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(44, 2600000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 900000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(45, 2750000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(46, 2900000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(47, 3100000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(48, 3400000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(49, 3700000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                ),
                new SkillReward(50, 4000000,
                        new XPReward() {
                            @Override
                            public int getXP() {
                                return 20;
                            }
                        },
                        new CoinReward() {
                            @Override
                            public int getCoins() {
                                return 1000000;
                            }
                        },
                        new StatisticReward() {
                            @Override
                            public ItemStatistic getStatistic() {
                                return ItemStatistic.STRENGTH;
                            }

                            @Override
                            public Double amountAdded() {
                                return 2D;
                            }
                        }
                )
        ).toArray(SkillReward[]::new);
    }
}
