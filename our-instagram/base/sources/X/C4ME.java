package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4ME, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4ME {
    public byte[] convertForegroundStateWithSubscriptionToThriftPayload(String str, Boolean bool, Integer num, List list, List list2) {
        return null;
    }

    public List getConnectSubscribeTopics(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubscribeTopic subscribeTopic = (SubscribeTopic) it.next();
            if (AbstractC62857SUe.A01.get(subscribeTopic.A01) != null) {
                arrayList.add(subscribeTopic);
            }
        }
        return arrayList;
    }

    public int handleConnectMessage(DataOutputStream dataOutputStream, R72 r72) {
        Long valueOf;
        C63146Sds c63146Sds = r72.A00;
        SXC sxc = (SXC) r72.A02;
        SZD szd = (SZD) r72.A01;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        Y49 y49 = new Y49(byteArrayOutputStream);
        C63187Sem c63187Sem = szd.A02;
        Y6f y6f = new Y6f(C05F.A00);
        C72723Xlv c72723Xlv = AbstractC73288XzY.A0P;
        Long l = c63187Sem.A0B;
        Map map = y6f.A01;
        map.put(c72723Xlv, l);
        map.put(AbstractC73288XzY.A0O, c63187Sem.A0I);
        map.put(AbstractC73288XzY.A01, c63187Sem.A07);
        map.put(AbstractC73288XzY.A09, c63187Sem.A09);
        map.put(AbstractC73288XzY.A0L, Integer.valueOf(c63187Sem.A00));
        map.put(AbstractC73288XzY.A0J, c63187Sem.A03);
        map.put(AbstractC73288XzY.A0G, c63187Sem.A01);
        map.put(AbstractC73288XzY.A07, c63187Sem.A0G);
        map.put(AbstractC73288XzY.A0E, c63187Sem.A02);
        map.put(AbstractC73288XzY.A0I, c63187Sem.A06);
        map.put(AbstractC73288XzY.A0H, c63187Sem.A05);
        map.put(AbstractC73288XzY.A03, c63187Sem.A0A);
        map.put(AbstractC73288XzY.A02, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = c63187Sem.A0J.iterator();
        while (it.hasNext()) {
            Object obj = AbstractC62857SUe.A01.get(it.next());
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        map.put(AbstractC73288XzY.A0N, arrayList);
        map.put(AbstractC73288XzY.A05, c63187Sem.A0D);
        C72723Xlv c72723Xlv2 = AbstractC73288XzY.A00;
        String str = c63187Sem.A0C;
        if (str == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(Long.parseLong(str));
        }
        map.put(c72723Xlv2, valueOf);
        map.put(AbstractC73288XzY.A0K, null);
        map.put(AbstractC73288XzY.A06, null);
        map.put(AbstractC73288XzY.A0M, c63187Sem.A0F);
        map.put(AbstractC73288XzY.A08, c63187Sem.A0H);
        map.put(AbstractC73288XzY.A04, c63187Sem.A04);
        map.put(AbstractC73288XzY.A0F, c63187Sem.A08);
        Y6f y6f2 = new Y6f(C05F.A0Y);
        C72723Xlv c72723Xlv3 = AbstractC73288XzY.A0U;
        String str2 = szd.A03;
        Map map2 = y6f2.A01;
        map2.put(c72723Xlv3, str2);
        map2.put(AbstractC73288XzY.A0d, szd.A06);
        map2.put(AbstractC73288XzY.A0c, szd.A05);
        map2.put(AbstractC73288XzY.A0V, y6f);
        map2.put(AbstractC73288XzY.A0Y, szd.A04);
        map2.put(AbstractC73288XzY.A0X, null);
        map2.put(AbstractC73288XzY.A0a, null);
        map2.put(AbstractC73288XzY.A0W, null);
        map2.put(AbstractC73288XzY.A0e, null);
        map2.put(AbstractC73288XzY.A0T, c63187Sem.A0K);
        map2.put(AbstractC73288XzY.A0b, null);
        String str3 = szd.A00;
        if (str3 != null) {
            Y6f y6f3 = new Y6f(C05F.A0j);
            C72723Xlv c72723Xlv4 = AbstractC73288XzY.A0s;
            Map map3 = y6f3.A01;
            map3.put(c72723Xlv4, str3);
            map3.put(AbstractC73288XzY.A0t, 0);
            map3.put(AbstractC73288XzY.A0r, null);
            map2.put(AbstractC73288XzY.A0Z, y6f3);
        }
        y6f2.A06(y49);
        byte[] A00 = AbstractC10110gQ.A00(byteArrayOutputStream.toByteArray());
        int length = A00.length;
        int i = length + 12;
        dataOutputStream.writeByte(AbstractC63236Sfo.A01(c63146Sds));
        int A02 = 1 + AbstractC63236Sfo.A02(dataOutputStream, i);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(6);
        dataOutputStream.writeByte(77);
        dataOutputStream.writeByte(81);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(84);
        dataOutputStream.writeByte(111);
        dataOutputStream.writeByte(84);
        dataOutputStream.write(sxc.A01);
        dataOutputStream.write(AbstractC63236Sfo.A00(sxc));
        dataOutputStream.writeShort(sxc.A00);
        dataOutputStream.write(A00, 0, length);
        dataOutputStream.flush();
        return A02 + i;
    }
}
