package com.instagram.realtimeclient;

import X.AbstractC62857SUe;
import X.C4ME;
import X.C4MF;
import X.C4PN;
import X.C73293Xzi;
import X.C95024Pl;
import X.T24;
import X.T25;
import X.T26;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class ThriftPayloadEncoder extends C4ME {
    public static T26 buildForegroundState(String str, Boolean bool, Integer num, List list, List list2) {
        LinkedList linkedList;
        LinkedList linkedList2;
        LinkedList linkedList3;
        LinkedList linkedList4 = null;
        if (list != null) {
            Iterator it = list.iterator();
            linkedList = null;
            linkedList2 = null;
            while (it.hasNext()) {
                SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
                String str2 = subscribeTopic.A01;
                Object obj = AbstractC62857SUe.A01.get(str2);
                if (obj != null) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(obj);
                } else {
                    if (linkedList2 == null) {
                        linkedList2 = new LinkedList();
                    }
                    linkedList2.add(new T25(str2, Integer.valueOf(subscribeTopic.A00)));
                }
            }
        } else {
            linkedList = null;
            linkedList2 = null;
        }
        if (list2 != null) {
            linkedList3 = null;
            for (Object obj2 : list2) {
                Object obj3 = AbstractC62857SUe.A01.get(obj2);
                if (obj3 != null) {
                    if (linkedList4 == null) {
                        linkedList4 = new LinkedList();
                    }
                    linkedList4.add(obj3);
                } else {
                    if (linkedList3 == null) {
                        linkedList3 = new LinkedList();
                    }
                    linkedList3.add(obj2);
                }
            }
        } else {
            linkedList3 = null;
        }
        return new T26(bool, num, str, linkedList, linkedList2, linkedList4, linkedList3);
    }

    @Override // X.C4ME
    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(String str, Boolean bool, Integer num, List list, List list2) {
        T26 buildForegroundState = buildForegroundState(str, bool, num, list, list2);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C95024Pl c95024Pl = new C95024Pl(new C4PN(byteArrayOutputStream));
            c95024Pl.A0U(T24.A01);
            c95024Pl.A0J();
            c95024Pl.A0K();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            C95024Pl c95024Pl2 = new C95024Pl(new C4PN(byteArrayOutputStream2));
            c95024Pl2.A0U(T26.A0G);
            Boolean bool2 = buildForegroundState.A00;
            if (bool2 != null) {
                c95024Pl2.A0Q(T26.A08);
                c95024Pl2.A0X(bool2.booleanValue());
            }
            Integer num2 = buildForegroundState.A01;
            if (num2 != null) {
                c95024Pl2.A0Q(T26.A0A);
                c95024Pl2.A0O(num2.intValue());
            }
            List list3 = buildForegroundState.A04;
            if (list3 != null) {
                c95024Pl2.A0Q(T26.A0D);
                c95024Pl2.A0R(new C73293Xzi(list3.size(), (byte) 8));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    c95024Pl2.A0O(((Number) it.next()).intValue());
                }
            }
            List<T25> list4 = buildForegroundState.A03;
            if (list4 != null) {
                c95024Pl2.A0Q(T26.A0C);
                c95024Pl2.A0R(new C73293Xzi(list4.size(), (byte) 12));
                for (T25 t25 : list4) {
                    c95024Pl2.A0U(T25.A04);
                    String str2 = t25.A01;
                    if (str2 != null) {
                        c95024Pl2.A0Q(T25.A03);
                        c95024Pl2.A0V(str2);
                    }
                    Integer num3 = t25.A00;
                    if (num3 != null) {
                        c95024Pl2.A0Q(T25.A02);
                        c95024Pl2.A0O(num3.intValue());
                    }
                    c95024Pl2.A0J();
                    c95024Pl2.A0K();
                }
            }
            List list5 = buildForegroundState.A06;
            if (list5 != null) {
                c95024Pl2.A0Q(T26.A0F);
                c95024Pl2.A0R(new C73293Xzi(list5.size(), (byte) 8));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    c95024Pl2.A0O(((Number) it2.next()).intValue());
                }
            }
            List list6 = buildForegroundState.A05;
            if (list6 != null) {
                c95024Pl2.A0Q(T26.A0E);
                c95024Pl2.A0R(new C73293Xzi(list6.size(), (byte) 11));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    c95024Pl2.A0V((String) it3.next());
                }
            }
            String str3 = buildForegroundState.A02;
            if (str3 != null) {
                c95024Pl2.A0Q(T26.A07);
                c95024Pl2.A0V(str3);
            }
            c95024Pl2.A0J();
            c95024Pl2.A0K();
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            int length = byteArray.length;
            int length2 = byteArray2.length;
            byte[] copyOf = Arrays.copyOf(byteArray, length + length2);
            System.arraycopy(byteArray2, 0, copyOf, length, length2);
            return copyOf;
        } catch (C4MF unused) {
            return null;
        }
    }
}
