package codetest;

import java.lang.reflect.Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;




public class MYcode {
	@Test
    public boolean hasGroupsSizeX(int[] deck) {
        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        search: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue search;
                return true;
            }

        return false;
    }
	
	@Test
	   public int lengthOfLastWord(String s) {
		String ss=s.trim();
int length=ss.length();
		System.out.println(length);
int count=0;

if(length==1) {
	if(s.charAt(1)!=' ') {
		return  1;
	}else {
		return 0;
	}
}

for(int i=length-1;i>=0;i--) {
	if(s.charAt(i)!=' ') { count++;
	}else {
		break;
	}
	
}
return count;
    }
	
	@Test
	 public int countPrimes(int n) {
int count=0;
if(n==0||n==1) return 0;
		for(int i=2;i<n;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0&&j!=i) {
				
					break;
				}else if(j==i) {
					count++;
				}
			}
			
		}
		
		return count;
    }

	
	@Test
	 public int[] getNoZeroIntegers(int n) {
int [] a=new int [2];
int x,y,count=1;
while(count<=n) {
x=count;
y=n-count;
String sx,sy;
sx=Integer.toString(x);
sy=Integer.toBinaryString(y);
if(!sx.contains("0")&&!sy.contains("0")) {
	a[0]=x;
	a[1]=y;
	break;
}
	count++;
}
	
return a;
    }

	
	@Test
	  public int[] createTargetArray(int[] nums, int[] index) {
		int [] a=new int [index.length];
		for(int i=0;i<index.length;i++) {
			if(a[index[i]]!=0) {
				
			}
		}
		 List<Integer> res = new ArrayList<>();
		 
		
		return a;
		
    }
	
	//生命游戏-细胞自动机(不好意思做不来，菜狗 )
	
	
	//原地交换数据，不适用临时变量 ，异或操作，或者用数轴的思想找相对距离。
	@Test
	   public int[] swapNumbers(int[] numbers) {

	    int n = numbers[0] ^ numbers[1];
        numbers[0] = n ^ numbers[0];
        numbers[1] = n ^ numbers[1];
        return numbers;
    }
	
	@Test
	   public String[] permutation(String S) {

		throw null;
    }
	//上升下降字符串
//	从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
//	从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
//	重复步骤 2 ，直到你没法从 s 中选择字符。
//	从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
//	从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
//	重复步骤 5 ，直到你没法从 s 中选择字符。
//	重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
//	aaaabbbbcccc abccbaabccba
	@Test
    public String sortString(String s) {
		char [] str=s.toCharArray();
		Arrays.parallelSort(str);
		String reslutstr=null;
		reslutstr+=str[0];
		char ch=str[0];
		for(int i=1;i<str.length;i++) {
			if(ch==str[i]) {
				continue;
			}else {
				ch=str[i];
				reslutstr+=ch;
			}
		}

throw null;
    }
	
//	给你一个整数数组 nums 。你可以选定任意的 正数 startValue 作为初始值。
//
//	你需要从左到右遍历 nums 数组，并将 startValue 依次累加上 nums 数组中的值。
//
//	请你在确保累加和始终大于等于 1 的前提下，选出一个最小的 正数 作为 startValue 。
//	nums = [-3,2,-3,4,2]
	@Test
	   public int minStartValue(int[] nums) {
	        int resultnumber=1;//假设最小从零开始
	        int sum=1;
	        for(int i:nums) {
	        	sum+=i;
	        	if(sum>=1) {
	        		continue;
	        	}else {
	        		int temp=1-sum;//如果小于1了记录下差额，再实时更新所选的最小正数值
	        		resultnumber+=temp;
	        		sum=1;
	        	}
   	
	        }
       return resultnumber;
	    }


//给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
    @Test
	public int arrayPairSum(int[] nums) {
    	Arrays.parallelSort(nums);
    	int n=nums.length/2;
    	int resultsum=0;
    	for(int i=nums.length-1;i>=1;i-=2) {
    		resultsum=nums[i-1];
    	}
    	return resultsum;
    }
    
    
//    给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
//
//    返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
   @Test
    public String generateTheString(int n) {
	   HashMap<Integer,Character> map=new HashMap<>();
	   	while(n>0) {
	   		n--;
	   	}	   	
	   	throw null;
    }

   
//   给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。
   
   @Test
   public static int dayOfYear(String date) {
	   HashMap<Integer,Integer> map=new HashMap<>();
	   String [] arr=date.split("-");
	   map.put(1, 31);map.put(3, 31);map.put(5, 31);map.put(7, 31);map.put(8, 31);map.put(10, 31);
	   map.put(12, 31);	   
	   map.put(2, 28);map.put(4, 31);map.put(6, 31);map.put(9, 31);map.put(11, 31);	   
	   boolean y=false;//默认是平年
	   
	   int year=Integer.valueOf(arr[0]);
	   int month=Integer.valueOf(arr[1]);
	   int day=Integer.valueOf(arr[2]);
	   if(year%400==0||(year%4==0&&year%100!=0))
	   {
		   y=true;//是瑞年。
		  
	   }
	   int sumday=0;
	   if(y==true) {
		   map.put(2, 29);
		  for(int i=1;i<month;i++) {	
			  sumday+=map.get(i);  
		  }
		  sumday+=day;
	   }else {
		   for(int i=1;i<month;i++) {	
				  sumday+=map.get(i);  
			  }
			  sumday+=day;    
	   }
return sumday;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}
	
	}
