package X;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5Qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116845Qn implements C4RK {
    public C4RQ A00;
    public C98704bq A01;
    public C98704bq A02;
    public C116855Qo A03;
    public final C116815Qk A04;
    public final AtomicReference A05;
    public final AtomicReference A06;

    public C116845Qn(C116815Qk c116815Qk) {
        C14360o3.A0B(c116815Qk, 1);
        this.A04 = c116815Qk;
        this.A06 = new AtomicReference("Unset");
        this.A05 = new AtomicReference("Unset");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.5Qo, java.lang.Object] */
    @Override // X.C4RK
    public final void ADh(C4RQ c4rq) {
        if (this.A00 != c4rq) {
            this.A00 = c4rq;
            ?? r1 = new C4RS() { // from class: X.5Qo
                @Override // X.C4RS
                public final /* synthetic */ void Cy0(C98704bq c98704bq) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void D5g(String str, boolean z) {
                }

                @Override // X.C4RS
                public final void D9S(long j, String str, boolean z) {
                    AtomicReference atomicReference;
                    C14360o3.A0B(str, 0);
                    C116845Qn c116845Qn = C116845Qn.this;
                    if (z) {
                        atomicReference = c116845Qn.A06;
                    } else {
                        atomicReference = c116845Qn.A05;
                    }
                    atomicReference.set(str);
                }

                @Override // X.C4RS
                public final void D9T(int i, int i2, int i3, int i4) {
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
                
                    if (r2.startsWith(org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND) == true) goto L11;
                 */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
                @Override // X.C4RS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void DBq(X.C98704bq r5, java.lang.String r6, java.util.List r7, long r8, boolean r10) {
                    /*
                        r4 = this;
                        r0 = 0
                        X.C14360o3.A0B(r5, r0)
                        X.5Qn r3 = X.C116845Qn.this
                        java.lang.String r2 = r5.A0E
                        r1 = 1
                        if (r2 == 0) goto L2c
                        java.lang.String r0 = "video"
                        X.C14360o3.A0B(r0, r1)
                        boolean r0 = r2.startsWith(r0)
                        if (r0 != r1) goto L2c
                        r0 = r5
                    L17:
                        r3.A02 = r0
                        if (r2 == 0) goto L29
                        java.lang.String r0 = "audio"
                        X.C14360o3.A0B(r0, r1)
                        boolean r0 = r2.startsWith(r0)
                        if (r0 != r1) goto L29
                    L26:
                        r3.A01 = r5
                        return
                    L29:
                        X.4bq r5 = r3.A01
                        goto L26
                    L2c:
                        X.4bq r0 = r3.A02
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C116855Qo.DBq(X.4bq, java.lang.String, java.util.List, long, boolean):void");
                }

                @Override // X.C4RS
                public final void DER(C117275Sm c117275Sm, String str, String str2, String str3, long j) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DIJ(String str, long j) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DLl(String str, byte[] bArr, long j) {
                }

                @Override // X.C4RS
                public final void DPI(boolean z) {
                }

                @Override // X.C4RS
                public final void DPK(String str, byte[] bArr, long j, long j2) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DPS(C68692VaS c68692VaS) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DTa(Object obj) {
                }

                @Override // X.C4RS
                public final void DVN(byte[] bArr, long j) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DY8(String str, String str2) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DZ0() {
                }

                @Override // X.C4RS
                public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void DZ6(EnumC46692Ch enumC46692Ch) {
                }

                @Override // X.C4RS
                public final void DZA(C4RU c4ru, float f, long j) {
                }

                @Override // X.C4RS
                public final void DaU(long j, String str) {
                }

                @Override // X.C4RS
                public final void DaY() {
                }

                @Override // X.C4RS
                public final void Dny(C4RV c4rv, C4RU c4ru, String str, long j, boolean z, boolean z2) {
                }

                @Override // X.C4RS
                public final void Dou(long j, long j2, boolean z, boolean z2, boolean z3) {
                }

                @Override // X.C4RS
                public final /* synthetic */ void Dp7(C5n5 c5n5) {
                }

                @Override // X.C4RS
                public final void DpT(boolean z) {
                }

                @Override // X.C4RS
                public final void DtM(List list) {
                }

                @Override // X.C4RS
                public final void Duk(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
                }

                @Override // X.C4RS
                public final void Dyn(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
                }

                @Override // X.C4RS
                public final void Dyu(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
                }

                @Override // X.C4RS
                public final void DzE(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
                }

                @Override // X.C4RS
                public final void Dzn() {
                }

                @Override // X.C4RS
                public final void Dzs() {
                }

                @Override // X.C4RS
                public final void Dzu(int i, int i2, float f) {
                }

                @Override // X.C4RS
                public final void E08(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
                }

                @Override // X.C4RS
                public final void E1K(boolean z, boolean z2) {
                }

                @Override // X.C4RS
                public final void E1j(C117275Sm c117275Sm) {
                }

                @Override // X.C4RS
                public final void onCues(List list) {
                }

                @Override // X.C4RS
                public final void onDrawnToSurface() {
                }

                @Override // X.C4RS
                public final void onSeeking(long j) {
                }
            };
            this.A03 = r1;
            c4rq.A0G.A00.add(r1);
        }
    }

    @Override // X.C4RK
    public final void F93() {
        C116855Qo c116855Qo;
        C4RQ c4rq = this.A00;
        if (c4rq != null && (c116855Qo = this.A03) != null) {
            c4rq.A0G.A00.remove(c116855Qo);
        }
        this.A03 = null;
        this.A00 = null;
    }
}
