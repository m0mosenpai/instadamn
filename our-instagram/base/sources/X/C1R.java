package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class C1R extends C17T implements C4d0 {
    public C38321qM A00;
    public C38321qM A01;
    public C38321qM A02;

    public static C38321qM A01(C1DY c1dy, C17T c17t, int i) {
        ImmutablePandoMediaDict immutablePandoMediaDict = (ImmutablePandoMediaDict) c17t.A05(i, ImmutablePandoMediaDict.class);
        if (immutablePandoMediaDict != null) {
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            return C38801rC.A00(c1dy, immutablePandoMediaDict);
        }
        return null;
    }

    @Override // X.C4d0
    public final XDTTextAppQuoteAttachmentEligibility Akc() {
        return (XDTTextAppQuoteAttachmentEligibility) A0N(1627211605, DOI.A00);
    }

    @Override // X.C4d0
    public final RepostRestrictedReason Bnt() {
        return (RepostRestrictedReason) A0N(-1057215812, DOJ.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    @Override // X.C4d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C99314cz F4t(X.C1DY r20) {
        /*
            r19 = this;
            r0 = r19
            com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility r5 = r0.Akc()
            r1 = -1811049390(0xffffffff940d9452, float:-7.147932E-27)
            java.lang.Boolean r9 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1294833502(0xffffffffb2d268a2, float:-2.4494799E-8)
            java.lang.Boolean r10 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1669173921(0xffffffff9c826d5f, float:-8.63095E-22)
            java.lang.Boolean r11 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 52469437(0x3209ebd, float:4.7201997E-37)
            java.lang.Boolean r12 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 1017849186(0x3cab2562, float:0.020891849)
            java.lang.Boolean r13 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = -1153560597(0xffffffffbb3e0feb, float:-0.0029001187)
            java.lang.Boolean r14 = r0.getOptionalBooleanValueByHashCode(r1)
            r1 = 537487417(0x20096839, float:1.1638836E-19)
            java.lang.Boolean r15 = r0.getOptionalBooleanValueByHashCode(r1)
            java.lang.Class<com.instagram.feed.media.ImmutablePandoMediaDict> r2 = com.instagram.feed.media.ImmutablePandoMediaDict.class
            r3 = 1614499173(0x603b4d65, float:5.398622E19)
            r1 = r20
            X.1qM r3 = A01(r1, r0, r3)
            r8 = 0
            if (r3 == 0) goto L9e
            X.17M r6 = r1.A00(r3)
            X.1qM r6 = (X.C38321qM) r6
        L4b:
            r3 = 363041910(0x15a39476, float:6.6069406E-26)
            java.lang.Boolean r16 = r0.getOptionalBooleanValueByHashCode(r3)
            r3 = 984746124(0x3ab2088c, float:0.001358287)
            java.lang.Integer r17 = r0.getOptionalIntValueByHashCode(r3)
            r3 = 1226924311(0x49216117, float:661009.44)
            com.facebook.pando.TreeJNI r3 = r0.A05(r3, r2)
            com.instagram.feed.media.ImmutablePandoMediaDict r3 = (com.instagram.feed.media.ImmutablePandoMediaDict) r3
            if (r3 == 0) goto L9c
            java.util.concurrent.atomic.AtomicBoolean r4 = X.C38321qM.A0i
            X.1qM r3 = X.C38801rC.A00(r1, r3)
            if (r3 == 0) goto L9c
            X.17M r7 = r1.A00(r3)
            X.1qM r7 = (X.C38321qM) r7
        L72:
            r3 = -2049598786(0xffffffff85d59abe, float:-2.0087267E-35)
            java.lang.String r18 = r0.A0i(r3)
            com.instagram.api.schemas.RepostRestrictedReason r4 = r0.Bnt()
            r3 = -1962612851(0xffffffff8b04e78d, float:-2.5596475E-32)
            com.facebook.pando.TreeJNI r0 = r0.A05(r3, r2)
            com.instagram.feed.media.ImmutablePandoMediaDict r0 = (com.instagram.feed.media.ImmutablePandoMediaDict) r0
            if (r0 == 0) goto L96
            java.util.concurrent.atomic.AtomicBoolean r2 = X.C38321qM.A0i
            X.1qM r0 = X.C38801rC.A00(r1, r0)
            if (r0 == 0) goto L96
            X.17M r8 = r1.A00(r0)
            X.1qM r8 = (X.C38321qM) r8
        L96:
            X.4cz r3 = new X.4cz
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r3
        L9c:
            r7 = r8
            goto L72
        L9e:
            r6 = r8
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1R.F4t(X.1DY):X.4cz");
    }

    @Override // X.C4d0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC47022Kqf.A00(this));
    }

    @Override // X.C4d0
    public final Boolean Akd() {
        return getOptionalBooleanValueByHashCode(-1811049390);
    }

    @Override // X.C4d0
    public final Boolean Akj() {
        return getOptionalBooleanValueByHashCode(-1294833502);
    }

    @Override // X.C4d0
    public final Boolean Al5() {
        return getOptionalBooleanValueByHashCode(-1669173921);
    }

    @Override // X.C4d0
    public final Boolean Al6() {
        return getOptionalBooleanValueByHashCode(52469437);
    }

    @Override // X.C4d0
    public final Boolean Bjr() {
        return getOptionalBooleanValueByHashCode(537487417);
    }

    @Override // X.C4d0
    public final C38321qM Bjs() {
        return this.A00;
    }

    @Override // X.C4d0
    public final Boolean Bjt() {
        return getOptionalBooleanValueByHashCode(363041910);
    }

    @Override // X.C4d0
    public final Integer Bju() {
        return getOptionalIntValueByHashCode(984746124);
    }

    @Override // X.C4d0
    public final C38321qM Bjw() {
        return this.A01;
    }

    @Override // X.C4d0
    public final String Bjx() {
        return A0i(-2049598786);
    }

    @Override // X.C4d0
    public final C38321qM Bnw() {
        return this.A02;
    }

    @Override // X.C4d0
    public final Boolean Cbu() {
        return getOptionalBooleanValueByHashCode(1017849186);
    }

    @Override // X.C4d0
    public final Boolean Cc0() {
        return getOptionalBooleanValueByHashCode(-1153560597);
    }

    @Override // X.C4d0
    public final C4d0 EBW(C1DY c1dy) {
        this.A00 = A01(c1dy, this, 1614499173);
        this.A01 = A01(c1dy, this, 1226924311);
        this.A02 = A01(c1dy, this, -1962612851);
        return this;
    }
}
