package X;

/* renamed from: X.4kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103054kg {
    public final C1339162z A00;
    public final C140026Vg A01;
    public final C140046Vi A02;
    public final C140056Vj A03;
    public final C140056Vj A04;

    public final C103054kg A01(C140056Vj c140056Vj) {
        C140056Vj c140056Vj2 = c140056Vj;
        if (c140056Vj == null) {
            c140056Vj2 = this.A04;
        }
        C140056Vj c140056Vj3 = this.A03;
        return new C103054kg(this.A00, this.A01, this.A02, c140056Vj2, c140056Vj3);
    }

    public final boolean A03(C140056Vj c140056Vj, long j) {
        boolean A04;
        C14360o3.A0B(c140056Vj, 1);
        C140126Vq A00 = c140056Vj.A00(j);
        if (A00 != null) {
            Object obj = A00.A00;
            Object obj2 = A00()[0];
            A00()[0] = obj;
            try {
                A02(j);
                A00()[0] = obj2;
                C140056Vj c140056Vj2 = this.A03;
                synchronized (c140056Vj2.A01) {
                    A04 = c140056Vj2.A00.A04(Long.valueOf(j));
                }
                return !A04;
            } catch (Throwable th) {
                A00()[0] = obj2;
                throw th;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final Object[] A00() {
        Object obj = AbstractC103024kd.A00.get();
        if (obj != null) {
            return (Object[]) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C103054kg(C1339162z c1339162z, C140026Vg c140026Vg, C140046Vi c140046Vi, C140056Vj c140056Vj, C140056Vj c140056Vj2) {
        this.A04 = c140056Vj;
        this.A03 = c140056Vj2;
        this.A01 = c140026Vg;
        this.A02 = c140046Vi;
        this.A00 = c1339162z;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(2:28|(2:30|(11:32|(3:34|(2:36|(1:38)(1:39))|40)|41|(1:(2:44|(2:51|52))(2:53|(3:57|(4:60|(3:62|63|64)(1:66)|65|58)|67)))|68|18|(1:20)|21|(1:23)|24|25)))(1:437)|70|71|(1:73)|74|75|76|(1:78)|79|(15:(2:82|(1:(2:85|(2:87|(2:89|(2:179|180)(2:93|(2:95|96)(3:97|(2:99|(1:101))|102)))(2:181|182))(4:183|(1:185)(1:252)|186|(2:188|(2:190|191)(2:192|(4:194|(7:239|240|241|(1:243)|244|(1:246)|247)|196|(8:231|232|233|234|209|(1:211)|212|(2:214|215))(9:200|201|202|203|(3:205|(1:207)|208)|209|(0)|212|(0)))(2:248|249)))(2:250|251)))(2:253|(2:290|291)(10:257|258|259|(1:261)|262|(5:264|(1:266)|267|368|279)(2:283|284)|427|428|(1:430)|431)))(2:292|(2:312|313)(4:296|(3:298|(2:300|(1:307)(3:(1:303)|304|305))(2:308|309)|306)|310|311)))(2:314|(2:423|424)(18:318|(2:421|422)|320|(1:322)|323|324|325|326|(1:328)(2:400|(2:402|(3:403|(4:405|(3:407|(2:409|410)(1:412)|411)|413|(1:415))|(1:417)(1:418)))(0))|329|(1:399)(1:333)|334|(1:(2:336|(8:339|340|(1:342)(1:384)|343|(3:345|(4:348|(1:364)(3:350|351|(3:357|358|(3:360|361|362)(1:363))(3:353|354|355))|356|346)|365)|366|(2:369|367)|370)(1:338))(5:385|386|(3:388|389|(3:392|393|(1:395)(1:396))(1:391))|397|398))|371|(2:381|(3:383|374|(2:376|217)))|373|374|(0)))|103|(1:105)|106|(2:108|(3:113|(2:115|(1:(1:(2:119|(1:121)(2:123|124))(2:125|(1:127)))(2:128|(1:130)))(1:(1:132)))(2:133|(2:135|(2:171|172)(4:139|(1:(2:141|(3:144|145|146)(1:143))(3:160|161|(1:(2:163|(3:166|167|168)(1:165))(2:169|170))))|147|(2:149|(1:151)(5:152|(1:154)|155|(1:157)|158))(1:159))))|112)(1:110))|174|(1:176)(1:178)|177|68|18|(0)|21|(0)|24|25)(2:425|426)) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x06fb, code lost:
    
        if (r2 == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0719, code lost:
    
        if (r3 != r2) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (X.C140146Vs.A00.A02(r34, r6, r4.A01, r35, true) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x05ad, code lost:
    
        if (r11.A0C() != null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0371, code lost:
    
        if (r15.A00.indexOfKey(r10) >= 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0603, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0604, code lost:
    
        r10 = X.C140146Vs.A00(r2, r6, r35);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e6 A[Catch: all -> 0x0308, TryCatch #6 {all -> 0x0308, blocks: (B:240:0x0210, B:243:0x0218, B:244:0x021f, B:246:0x0236, B:247:0x023b, B:196:0x023e, B:198:0x0249, B:200:0x0255, B:203:0x0277, B:205:0x0294, B:207:0x029a, B:208:0x02db, B:209:0x02df, B:211:0x02e6, B:212:0x02ec, B:220:0x0301, B:221:0x0307, B:231:0x02a4, B:234:0x02bd, B:237:0x02fa, B:202:0x0273, B:233:0x02b0), top: B:239:0x0210, outer: #4, inners: #2, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x05ff A[Catch: Exception -> 0x0603, all -> 0x071d, TryCatch #9 {Exception -> 0x0603, blocks: (B:71:0x0123, B:73:0x0127, B:74:0x0129, B:103:0x05b2, B:105:0x05ba, B:428:0x05f7, B:430:0x05ff, B:431:0x0602), top: B:70:0x0123, outer: #8 }] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r30v0, types: [X.6Vr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C140126Vq A02(long r35) {
        /*
            Method dump skipped, instructions count: 1829
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103054kg.A02(long):X.6Vq");
    }
}
