package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.KLx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45720KLx extends AbstractRunnableC14200nk {
    public final /* synthetic */ C47954LGp A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45720KLx(C47954LGp c47954LGp, String str) {
        super(769113367, 3, true, false);
        this.A00 = c47954LGp;
        this.A01 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        final String str;
        LLZ llz;
        C47954LGp c47954LGp = this.A00;
        if (!C18U.A06(C06090Tz.A05, c47954LGp.A02, 2342156760134650096L)) {
            c47954LGp.A03.put(this.A01, C47954LGp.A05);
        }
        InterfaceC09390do interfaceC09390do = c47954LGp.A04;
        C47916LEk c47916LEk = (C47916LEk) interfaceC09390do.getValue();
        long j = c47916LEk.A00;
        if (j != 0) {
            boolean z = false;
            if (SystemClock.uptimeMillis() - j >= 700) {
                z = true;
            }
            c47916LEk.A01 = z;
        }
        c47916LEk.A00 = SystemClock.uptimeMillis();
        C47916LEk c47916LEk2 = (C47916LEk) interfaceC09390do.getValue();
        final String str2 = this.A01;
        final int hashCode = C0HM.A00().hashCode();
        SWY swy = C47916LEk.A04;
        String A00 = LHs.A00(str2);
        if (A00 != null) {
            str = LHs.A01(A00, LHs.A02);
        } else {
            str = null;
        }
        final Locale locale = c47916LEk2.A03;
        boolean z2 = c47916LEk2.A01;
        C47735L5w c47735L5w = c47916LEk2.A02;
        Runnable runnable = AbstractC47200KtZ.A01;
        if (!TextUtils.isEmpty(str)) {
            if (str != null && (llz = (LLZ) AbstractC47200KtZ.A00.get(str)) != null) {
                c47735L5w.A00(llz, str2);
                return;
            }
            HashMap hashMap = AbstractC47200KtZ.A02;
            AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
            if (abstractCollection != null) {
                abstractCollection.add(c47735L5w);
                return;
            }
            ArrayList A17 = AbstractC25225BEi.A17(1);
            A17.add(c47735L5w);
            hashMap.put(str, A17);
            final LLZ llz2 = new LLZ(new L8J(hashCode), str);
            Runnable runnable2 = new Runnable() { // from class: X.M6Z
                /* JADX WARN: Can't wrap try/catch for region: R(20:(2:59|(24:61|62|(21:129|72|73|74|75|76|(2:77|(2:79|(1:81)(1:112))(1:113))|84|85|86|87|88|(1:90)(1:108)|91|92|(2:96|97)|100|(1:102)|103|(1:105)|106)|71|72|73|74|75|76|(2:77|(0)(0))|84|85|86|87|88|(0)(0)|91|92|(3:94|96|97)|100|(0)|103|(0)|106))|73|74|75|76|(2:77|(0)(0))|84|85|86|87|88|(0)(0)|91|92|(0)|100|(0)|103|(0)|106) */
                /* JADX WARN: Code restructure failed: missing block: B:109:0x01d4, code lost:
                
                    r2 = new java.lang.String(r3, X.AbstractC47189KtO.A00);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
                
                    X.LLZ.A07(r11);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
                
                    if (r1 != 2) goto L55;
                 */
                /* JADX WARN: Removed duplicated region for block: B:102:0x020b A[Catch: URISyntaxException -> 0x03a3, IOException -> 0x03a9, TryCatch #17 {IOException -> 0x03a9, URISyntaxException -> 0x03a3, blocks: (B:3:0x0011, B:5:0x0017, B:7:0x001f, B:11:0x0035, B:12:0x0040, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:19:0x0052, B:21:0x007b, B:23:0x0082, B:24:0x00a8, B:29:0x0248, B:30:0x00b2, B:32:0x00bb, B:33:0x00cc, B:37:0x00d4, B:39:0x00e4, B:41:0x00ec, B:43:0x00f5, B:44:0x00f7, B:46:0x00fd, B:47:0x0103, B:49:0x0115, B:52:0x012c, B:100:0x0200, B:102:0x020b, B:103:0x0217, B:105:0x021f, B:106:0x022b, B:132:0x0244, B:133:0x0247, B:136:0x008b, B:138:0x009d, B:140:0x00a5, B:142:0x024b, B:144:0x0251, B:145:0x0258, B:147:0x025e, B:217:0x0265, B:149:0x026c, B:151:0x026e, B:153:0x0277, B:155:0x027b, B:156:0x0280, B:158:0x028a, B:161:0x02a4, B:162:0x02aa, B:164:0x02bd, B:165:0x02e2, B:167:0x02e8, B:184:0x031d, B:186:0x0337, B:188:0x0349, B:190:0x036c, B:191:0x034d, B:193:0x0355, B:194:0x035c, B:195:0x0370, B:197:0x0379, B:208:0x039a, B:211:0x0397, B:213:0x029e, B:215:0x039c, B:57:0x0131, B:59:0x0139, B:61:0x0145, B:62:0x0156, B:64:0x0160, B:66:0x0168, B:68:0x0170, B:72:0x0181, B:86:0x01c0, B:88:0x01c3, B:90:0x01c9, B:91:0x01cb, B:92:0x01db, B:94:0x01ea, B:97:0x01f0, B:109:0x01d4, B:125:0x0242, B:128:0x023f, B:74:0x018a, B:85:0x01bd, B:117:0x0238, B:121:0x0235, B:124:0x023a), top: B:2:0x0011, inners: #0, #9, #12, #13 }] */
                /* JADX WARN: Removed duplicated region for block: B:105:0x021f A[Catch: URISyntaxException -> 0x03a3, IOException -> 0x03a9, TryCatch #17 {IOException -> 0x03a9, URISyntaxException -> 0x03a3, blocks: (B:3:0x0011, B:5:0x0017, B:7:0x001f, B:11:0x0035, B:12:0x0040, B:15:0x003b, B:16:0x0046, B:18:0x004c, B:19:0x0052, B:21:0x007b, B:23:0x0082, B:24:0x00a8, B:29:0x0248, B:30:0x00b2, B:32:0x00bb, B:33:0x00cc, B:37:0x00d4, B:39:0x00e4, B:41:0x00ec, B:43:0x00f5, B:44:0x00f7, B:46:0x00fd, B:47:0x0103, B:49:0x0115, B:52:0x012c, B:100:0x0200, B:102:0x020b, B:103:0x0217, B:105:0x021f, B:106:0x022b, B:132:0x0244, B:133:0x0247, B:136:0x008b, B:138:0x009d, B:140:0x00a5, B:142:0x024b, B:144:0x0251, B:145:0x0258, B:147:0x025e, B:217:0x0265, B:149:0x026c, B:151:0x026e, B:153:0x0277, B:155:0x027b, B:156:0x0280, B:158:0x028a, B:161:0x02a4, B:162:0x02aa, B:164:0x02bd, B:165:0x02e2, B:167:0x02e8, B:184:0x031d, B:186:0x0337, B:188:0x0349, B:190:0x036c, B:191:0x034d, B:193:0x0355, B:194:0x035c, B:195:0x0370, B:197:0x0379, B:208:0x039a, B:211:0x0397, B:213:0x029e, B:215:0x039c, B:57:0x0131, B:59:0x0139, B:61:0x0145, B:62:0x0156, B:64:0x0160, B:66:0x0168, B:68:0x0170, B:72:0x0181, B:86:0x01c0, B:88:0x01c3, B:90:0x01c9, B:91:0x01cb, B:92:0x01db, B:94:0x01ea, B:97:0x01f0, B:109:0x01d4, B:125:0x0242, B:128:0x023f, B:74:0x018a, B:85:0x01bd, B:117:0x0238, B:121:0x0235, B:124:0x023a), top: B:2:0x0011, inners: #0, #9, #12, #13 }] */
                /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x01b9 A[EDGE_INSN: B:113:0x01b9->B:84:0x01b9 BREAK  A[LOOP:1: B:77:0x0195->B:111:?], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:221:0x03bd  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x03db  */
                /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:79:0x019c A[Catch: all -> 0x022f, TryCatch #5 {all -> 0x022f, blocks: (B:76:0x0191, B:77:0x0195, B:79:0x019c, B:81:0x01a2, B:84:0x01b9), top: B:75:0x0191, outer: #14 }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x01c9 A[Catch: UnsupportedEncodingException -> 0x01d4, all -> 0x0243, TryCatch #6 {UnsupportedEncodingException -> 0x01d4, blocks: (B:88:0x01c3, B:90:0x01c9, B:91:0x01cb), top: B:87:0x01c3, outer: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:94:0x01ea A[Catch: all -> 0x0243, TryCatch #0 {all -> 0x0243, blocks: (B:57:0x0131, B:59:0x0139, B:61:0x0145, B:62:0x0156, B:64:0x0160, B:66:0x0168, B:68:0x0170, B:72:0x0181, B:86:0x01c0, B:88:0x01c3, B:90:0x01c9, B:91:0x01cb, B:92:0x01db, B:94:0x01ea, B:97:0x01f0, B:109:0x01d4, B:125:0x0242, B:128:0x023f, B:74:0x018a, B:85:0x01bd, B:117:0x0238, B:121:0x0235, B:124:0x023a), top: B:56:0x0131, outer: #17, inners: #6, #14, #16 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 995
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.M6Z.run():void");
                }
            };
            if (z2) {
                SWY.A03.execute(runnable2);
                return;
            }
            if (AbstractC47200KtZ.A01 != null) {
                synchronized (swy) {
                    Handler handler = swy.A00;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                }
            }
            synchronized (swy) {
                Handler handler2 = swy.A00;
                if (handler2 == null) {
                    HandlerThread handlerThread = new HandlerThread("WhatsApp Worker Scheduler", 10);
                    AbstractC09770fa.A00(handlerThread);
                    handlerThread.start();
                    handler2 = new Handler(handlerThread.getLooper());
                    swy.A00 = handler2;
                }
                handler2.postDelayed(new RunnableC49918M2l(swy, runnable2), 700L);
            }
            AbstractC47200KtZ.A01 = runnable2;
        }
    }
}
