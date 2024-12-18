package X;

import com.facebook.papaya.log.LogSink;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MyA extends LogSink {
    public final Map A00 = AbstractC166987dD.A1G();

    @Override // com.facebook.papaya.log.LogSink
    public final synchronized void event(long j, long j2, long j3, int i, Map map, String str) {
        Iterator A16 = AbstractC166997dE.A16(this.A00);
        while (A16.hasNext()) {
            ((LogSink) A16.next()).event(j, j2, j3, i, map, str);
        }
    }

    @Override // com.facebook.papaya.log.LogSink
    public final synchronized void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
        Iterator A16 = AbstractC166997dE.A16(this.A00);
        while (A16.hasNext()) {
            ((LogSink) A16.next()).log(j, j2, j3, i, str, i2, str2);
        }
    }
}
