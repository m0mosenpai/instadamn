package X;

/* renamed from: X.8gK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C192788gK extends AbstractC192798gL {
    public final C192778gJ A00;
    public final C1Dk A01;
    public final C40701ud A02;

    public C192788gK(C1Dk c1Dk, C192778gJ c192778gJ, C40701ud c40701ud) {
        C14360o3.A0B(c40701ud, 2);
        this.A01 = c1Dk;
        this.A02 = c40701ud;
        this.A00 = c192778gJ;
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return -6;
    }

    @Override // X.C11R
    public final void onCancel() {
    }

    @Override // X.C11R
    public final void onFinish() {
    }

    @Override // X.C11R
    public final void onStart() {
    }

    @Override // X.C11R
    public final String getName() {
        String callName = this.A01.getCallName();
        C14360o3.A07(callName);
        return callName;
    }

    @Override // X.C11R
    public final void run() {
        this.A02.A06(this.A01, new C1P1() { // from class: X.8gR
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int i;
                int A03 = C0f9.A03(1218492341);
                C14360o3.A0B(abstractC115105If, 0);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    ((AbstractC192798gL) C192788gK.this).A00.A02(new C115095Ie(A01));
                    i = -1560762578;
                } else {
                    i = -1253958489;
                }
                C0f9.A0A(i, A03);
            }

            @Override // X.C1P1
            public final void onFinish() {
                int A03 = C0f9.A03(-935926949);
                AbstractC192848gQ abstractC192848gQ = ((AbstractC192798gL) C192788gK.this).A00.A00;
                if (abstractC192848gQ != null) {
                    abstractC192848gQ.A01();
                }
                C0f9.A0A(1921375298, A03);
            }

            @Override // X.C1P1
            public final void onStart() {
                int A03 = C0f9.A03(-1854717920);
                AbstractC192848gQ abstractC192848gQ = ((AbstractC192798gL) C192788gK.this).A00.A00;
                if (abstractC192848gQ != null) {
                    abstractC192848gQ.A02();
                }
                C0f9.A0A(155745495, A03);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
            @Override // X.C1P1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r12) {
                /*
                    r11 = this;
                    r0 = -68223720(0xfffffffffbeefd18, float:-2.4818E36)
                    int r4 = X.C0f9.A03(r0)
                    X.435 r12 = (X.AnonymousClass435) r12
                    r0 = 2027642108(0x78db5cfc, float:3.5593717E34)
                    int r3 = X.C0f9.A03(r0)
                    r8 = 0
                    X.C14360o3.A0B(r12, r8)
                    X.8gK r2 = X.C192788gK.this
                    java.lang.Object r6 = r12.A01
                    X.2JS r6 = (X.C2JS) r6
                    if (r6 != 0) goto L4e
                    java.lang.String r1 = "No result in IGBloksAppRootQuery response"
                    java.lang.Exception r0 = new java.lang.Exception
                    r0.<init>(r1)
                    X.5Ie r1 = new X.5Ie
                    r1.<init>(r0)
                L28:
                    java.lang.Object r5 = r1.A00()
                    X.8gg r5 = (X.AbstractC193008gg) r5
                    if (r5 == 0) goto L35
                    X.8gM r0 = r2.A00
                    r0.A01(r5)
                L35:
                    X.1W2 r5 = X.C1W2.A00()
                    X.8gl r0 = new X.8gl
                    r0.<init>()
                    r5.A01(r0)
                    r0 = -662690229(0xffffffffd880264b, float:-1.1272156E15)
                    X.C0f9.A0A(r0, r3)
                    r0 = -1872999706(0xffffffff905c4ae6, float:-4.344505E-29)
                    X.C0f9.A0A(r0, r4)
                    return
                L4e:
                    X.8gJ r7 = r2.A00
                    java.lang.Class<X.8gT> r5 = X.C192878gT.class
                    java.lang.String r1 = "bloks_app(bk_context:$bk_context,params:$params)"
                    r0 = 1815895451(0x6c3c5d9b, float:9.108804E26)
                    X.2JS r6 = r6.getOptionalTreeField(r8, r1, r5, r0)
                    if (r6 == 0) goto Lc0
                    java.lang.Class<X.8gU> r5 = X.C192888gU.class
                    java.lang.String r1 = "screen_content"
                    r0 = 639075374(0x2617842e, float:5.2567786E-16)
                    X.2JS r6 = r6.getOptionalTreeField(r8, r1, r5, r0)
                    if (r6 == 0) goto Lc0
                    java.lang.Class<X.8gV> r5 = X.C192898gV.class
                    java.lang.String r1 = "component"
                    r0 = -127346585(0xfffffffff868d867, float:-1.8890657E34)
                    X.2JS r6 = r6.getOptionalTreeField(r8, r1, r5, r0)
                    if (r6 == 0) goto Lc0
                    java.lang.Class<X.8gW> r5 = X.C192908gW.class
                    java.lang.String r1 = "bundle"
                    r0 = 701760194(0x29d402c2, float:9.4151697E-14)
                    X.2JS r1 = r6.getOptionalTreeField(r8, r1, r5, r0)
                    if (r1 == 0) goto Lc0
                    java.lang.String r0 = "bloks_bundle_tree"
                    java.lang.String r5 = r1.getOptionalStringField(r8, r0)
                    if (r5 == 0) goto Lc0
                    X.63C r1 = r7.A00
                    r0 = 0
                    X.62s r0 = X.AbstractC192918gX.A00(r1, r5, r0)
                    if (r0 != 0) goto Lba
                    java.lang.String r0 = "Failed to parse bloks bundle tree"
                    java.lang.Exception r5 = new java.lang.Exception
                    r5.<init>(r0)
                L9c:
                    X.5Ie r1 = new X.5Ie
                    r1.<init>(r5)
                La1:
                    boolean r0 = r1 instanceof X.C115115Ig
                    if (r0 == 0) goto Lc8
                    X.5Ig r1 = (X.C115115Ig) r1
                    java.lang.Object r6 = r1.A00
                    X.62s r6 = (X.C1338462s) r6
                    r7 = 0
                    X.8gf r5 = new X.8gf
                    r9 = r7
                    r5.<init>(r6, r7, r9)
                    X.5Ig r1 = new X.5Ig
                    r1.<init>(r5)
                    goto L28
                Lba:
                    X.5Ig r1 = new X.5Ig
                    r1.<init>(r0)
                    goto La1
                Lc0:
                    java.lang.String r0 = "Null response from Bloks IGBloksAppRootQuery"
                    java.lang.NullPointerException r5 = new java.lang.NullPointerException
                    r5.<init>(r0)
                    goto L9c
                Lc8:
                    boolean r0 = r1 instanceof X.C115095Ie
                    if (r0 != 0) goto L28
                    X.B4Z r0 = new X.B4Z
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C192858gR.onSuccessInBackground(java.lang.Object):void");
            }
        });
    }
}
