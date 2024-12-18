package com.instagram.creation.drafts.model.datasource.clips;

import X.C0f5;
import X.C16450rq;
import X.C16930sl;
import X.C18950wb;
import X.C2PV;
import X.C2Q7;
import X.C5JK;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes.dex */
public final class ClipsDraftDaoWithSoftFail extends C2PV {
    public final UserSession A00;
    public final C2PV A01;

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 7
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L24
            r5 = r9
            X.9CX r5 = (X.C9CX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L73
            if (r0 != r2) goto L30
            goto L2c
        L24:
            r0 = 42
            X.9CX r5 = new X.9CX
            r5.<init>(r6, r9, r3, r0)
            goto L15
        L2c:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5b
            goto L76
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L38:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A08(r7, r8, r5)
        L4f:
            if (r0 != r3) goto L76
            return r3
        L52:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5b
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.A08(r7, r8, r5)     // Catch: java.lang.Throwable -> L5b
            goto L4f
        L5b:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L76
        L73:
            X.AbstractC09560e7.A00(r4)
        L76:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A08(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r5 = 2
            boolean r0 = X.C9CX.A00(r8, r5)
            if (r0 == 0) goto L23
            r4 = r8
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 == r1) goto L72
            if (r0 != r5) goto L2f
            goto L2b
        L23:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r6, r8, r5, r0)
            goto L15
        L2b:
            X.AbstractC09560e7.A00(r3)     // Catch: java.lang.Throwable -> L5a
            goto L75
        L2f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L37:
            X.AbstractC09560e7.A00(r3)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L51
            X.2PV r0 = r6.A01
            r4.A00 = r1
            java.lang.Object r0 = r0.A09(r7, r4)
        L4e:
            if (r0 != r2) goto L75
            return r2
        L51:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5a
            r4.A00 = r5     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r0.A09(r7, r4)     // Catch: java.lang.Throwable -> L5a
            goto L4e
        L5a:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L75
        L72:
            X.AbstractC09560e7.A00(r3)
        L75:
            X.0eB r2 = X.C0eB.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A09(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0C(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 4
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L24
            r4 = r9
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r6 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L34
            if (r0 != r2) goto L2c
            goto L5d
        L24:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r7, r9, r3, r0)
            goto L15
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L34:
            X.AbstractC09560e7.A00(r6)
            return r6
        L38:
            X.AbstractC09560e7.A00(r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            X.2PV r0 = r7.A01
            r4.A00 = r1
            java.lang.Object r6 = r0.A0C(r8, r4)
            if (r6 != r3) goto L7b
            return r3
        L52:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L63
            r4.A00 = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r0.A0C(r8, r4)     // Catch: java.lang.Throwable -> L63
            if (r6 != r3) goto L60
            return r3
        L5d:
            X.AbstractC09560e7.A00(r6)     // Catch: java.lang.Throwable -> L63
        L60:
            X.MVn r6 = (X.C50602MVn) r6     // Catch: java.lang.Throwable -> L63
            return r6
        L63:
            r5 = move-exception
            r6 = 0
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0C(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0F(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 5
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L24
            r4 = r9
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r6 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L34
            if (r0 != r2) goto L2c
            goto L5d
        L24:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r7, r9, r3, r0)
            goto L15
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L34:
            X.AbstractC09560e7.A00(r6)
            return r6
        L38:
            X.AbstractC09560e7.A00(r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            X.2PV r0 = r7.A01
            r4.A00 = r1
            java.lang.Object r6 = r0.A0F(r8, r4)
            if (r6 != r3) goto L7b
            return r3
        L52:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L63
            r4.A00 = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r0.A0F(r8, r4)     // Catch: java.lang.Throwable -> L63
            if (r6 != r3) goto L60
            return r3
        L5d:
            X.AbstractC09560e7.A00(r6)     // Catch: java.lang.Throwable -> L63
        L60:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L63
            return r6
        L63:
            r5 = move-exception
            r6 = 0
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0F(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0G(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 6
            boolean r0 = X.C9CX.A00(r9, r3)
            if (r0 == 0) goto L24
            r4 = r9
            X.9CX r4 = (X.C9CX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r6 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L34
            if (r0 != r2) goto L2c
            goto L5d
        L24:
            r0 = 42
            X.9CX r4 = new X.9CX
            r4.<init>(r7, r9, r3, r0)
            goto L15
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L34:
            X.AbstractC09560e7.A00(r6)
            return r6
        L38:
            X.AbstractC09560e7.A00(r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            X.2PV r0 = r7.A01
            r4.A00 = r1
            java.lang.Object r6 = r0.A0G(r8, r4)
            if (r6 != r3) goto L7b
            return r3
        L52:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L63
            r4.A00 = r2     // Catch: java.lang.Throwable -> L63
            java.lang.Object r6 = r0.A0G(r8, r4)     // Catch: java.lang.Throwable -> L63
            if (r6 != r3) goto L60
            return r3
        L5d:
            X.AbstractC09560e7.A00(r6)     // Catch: java.lang.Throwable -> L63
        L60:
            X.MWL r6 = (X.MWL) r6     // Catch: java.lang.Throwable -> L63
            return r6
        L63:
            r5 = move-exception
            r6 = 0
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0G(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0N(X.InterfaceC23621Ds r7, long r8) {
        /*
            r6 = this;
            r3 = 3
            boolean r0 = X.C9CX.A00(r7, r3)
            if (r0 == 0) goto L24
            r5 = r7
            X.9CX r5 = (X.C9CX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L73
            if (r0 != r2) goto L30
            goto L2c
        L24:
            r0 = 42
            X.9CX r5 = new X.9CX
            r5.<init>(r6, r7, r3, r0)
            goto L15
        L2c:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5b
            goto L76
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L38:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L52
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0N(r5, r8)
        L4f:
            if (r0 != r3) goto L76
            return r3
        L52:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5b
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.A0N(r5, r8)     // Catch: java.lang.Throwable -> L5b
            goto L4f
        L5b:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L76
        L73:
            X.AbstractC09560e7.A00(r4)
        L76:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0N(X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(int r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 40
            boolean r0 = X.MAG.A01(r9, r3)
            if (r0 == 0) goto L27
            r5 = r9
            X.MAG r5 = (X.MAG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r5.A00
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L35
            if (r3 == r1) goto L51
            if (r3 != r2) goto L2d
            java.lang.Object r6 = r5.A01
            goto L62
        L27:
            X.MAG r5 = new X.MAG
            r5.<init>(r7, r9, r3)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r0)
            X.0sl r6 = X.C16930sl.A00
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L55
            X.2PV r0 = r7.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A01(r8, r5)
            if (r0 != r4) goto L54
            return r4
        L51:
            X.AbstractC09560e7.A00(r0)
        L54:
            return r0
        L55:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L68
            r5.A01 = r6     // Catch: java.lang.Throwable -> L68
            r5.A00 = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.A01(r8, r5)     // Catch: java.lang.Throwable -> L68
            if (r0 != r4) goto L65
            return r4
        L62:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6a
        L65:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L6a
            return r0
        L68:
            r5 = move-exception
            goto L6b
        L6a:
            r5 = move-exception
        L6b:
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A01(int, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C5JK r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 25
            boolean r0 = X.C9CY.A00(r9, r3)
            if (r0 == 0) goto L27
            r5 = r9
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r5.A00
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L35
            if (r3 == r1) goto L51
            if (r3 != r2) goto L2d
            java.lang.Object r6 = r5.A01
            goto L62
        L27:
            X.9CY r5 = new X.9CY
            r5.<init>(r7, r9, r3)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r0)
            X.0sl r6 = X.C16930sl.A00
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L55
            X.2PV r0 = r7.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A02(r8, r5)
            if (r0 != r4) goto L54
            return r4
        L51:
            X.AbstractC09560e7.A00(r0)
        L54:
            return r0
        L55:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L68
            r5.A01 = r6     // Catch: java.lang.Throwable -> L68
            r5.A00 = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.A02(r8, r5)     // Catch: java.lang.Throwable -> L68
            if (r0 != r4) goto L65
            return r4
        L62:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6a
        L65:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L6a
            return r0
        L68:
            r5 = move-exception
            goto L6b
        L6a:
            r5 = move-exception
        L6b:
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A02(X.5JK, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.C5JK r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 26
            boolean r0 = X.C9CY.A00(r10, r3)
            if (r0 == 0) goto L28
            r7 = r10
            X.9CY r7 = (X.C9CY) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r7.A00
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L36
            if (r3 == r1) goto L54
            if (r3 != r2) goto L2e
            java.lang.Object r5 = r7.A01
            goto L65
        L28:
            X.9CY r7 = new X.9CY
            r7.<init>(r8, r10, r3)
            goto L16
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L58
            X.2PV r0 = r8.A01
            r7.A00 = r1
            java.lang.Object r0 = r0.A03(r9, r7)
            if (r0 != r4) goto L57
            return r4
        L54:
            X.AbstractC09560e7.A00(r0)
        L57:
            return r0
        L58:
            X.2PV r0 = r8.A01     // Catch: java.lang.Throwable -> L6b
            r7.A01 = r5     // Catch: java.lang.Throwable -> L6b
            r7.A00 = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.A03(r9, r7)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r4) goto L68
            return r4
        L65:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6d
        L68:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6d
            return r0
        L6b:
            r4 = move-exception
            goto L6e
        L6d:
            r4 = move-exception
        L6e:
            r3 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r2 = X.C18950wb.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r2.AEr(r1, r0, r3, r6)
            r0.ERI(r4)
            r0.report()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A03(X.5JK, X.1Ds):java.lang.Object");
    }

    @Override // X.C2PV
    public final Object A04(C5JK c5jk, InterfaceC23621Ds interfaceC23621Ds) {
        return this.A01.A04(c5jk, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.C5JK r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 27
            boolean r0 = X.C9CY.A00(r10, r3)
            if (r0 == 0) goto L28
            r7 = r10
            X.9CY r7 = (X.C9CY) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r7.A00
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L36
            if (r3 == r1) goto L54
            if (r3 != r2) goto L2e
            java.lang.Object r5 = r7.A01
            goto L65
        L28:
            X.9CY r7 = new X.9CY
            r7.<init>(r8, r10, r3)
            goto L16
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L58
            X.2PV r0 = r8.A01
            r7.A00 = r1
            java.lang.Object r0 = r0.A05(r9, r7)
            if (r0 != r4) goto L57
            return r4
        L54:
            X.AbstractC09560e7.A00(r0)
        L57:
            return r0
        L58:
            X.2PV r0 = r8.A01     // Catch: java.lang.Throwable -> L6b
            r7.A01 = r5     // Catch: java.lang.Throwable -> L6b
            r7.A00 = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.A05(r9, r7)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r4) goto L68
            return r4
        L65:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6d
        L68:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6d
            return r0
        L6b:
            r4 = move-exception
            goto L6e
        L6d:
            r4 = move-exception
        L6e:
            r3 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r2 = X.C18950wb.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r2.AEr(r1, r0, r3, r6)
            r0.ERI(r4)
            r0.report()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A05(X.5JK, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.C54744OFv r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 28
            boolean r0 = X.C9CY.A00(r9, r3)
            if (r0 == 0) goto L27
            r4 = r9
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 == r2) goto L56
            if (r1 != r3) goto L2d
            java.lang.Object r6 = r4.A01
            goto L72
        L27:
            X.9CY r4 = new X.9CY
            r4.<init>(r7, r9, r3)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r0)
            r0 = 0
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L65
            X.2PV r0 = r7.A01
            r4.A00 = r2
            java.lang.Object r0 = r0.A06(r8, r4)
            if (r0 != r5) goto L59
            return r5
        L56:
            X.AbstractC09560e7.A00(r0)
        L59:
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            return r2
        L65:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L81
            r4.A01 = r6     // Catch: java.lang.Throwable -> L81
            r4.A00 = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r0.A06(r8, r4)     // Catch: java.lang.Throwable -> L81
            if (r0 != r5) goto L75
            return r5
        L72:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L83
        L75:
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L83
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L83
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L83
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L83
            return r2
        L81:
            r5 = move-exception
            goto L84
        L83:
            r5 = move-exception
        L84:
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A06(X.OFv, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 33
            boolean r0 = X.MAM.A02(r9, r3)
            if (r0 == 0) goto L25
            r5 = r9
            X.MAM r5 = (X.MAM) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L74
            if (r0 != r2) goto L31
            goto L2d
        L25:
            r0 = 42
            X.MAM r5 = new X.MAM
            r5.<init>(r6, r9, r3, r0)
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5c
            goto L77
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A07(r7, r8, r5)
        L50:
            if (r0 != r3) goto L77
            return r3
        L53:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.A07(r7, r8, r5)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L5c:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L77
        L74:
            X.AbstractC09560e7.A00(r4)
        L77:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A07(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0A(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 30
            boolean r0 = X.MAM.A02(r8, r3)
            if (r0 == 0) goto L25
            r5 = r8
            X.MAM r5 = (X.MAM) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L74
            if (r0 != r2) goto L31
            goto L2d
        L25:
            r0 = 42
            X.MAM r5 = new X.MAM
            r5.<init>(r6, r8, r3, r0)
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5c
            goto L77
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0A(r7, r5)
        L50:
            if (r0 != r3) goto L77
            return r3
        L53:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.A0A(r7, r5)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L5c:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L77
        L74:
            X.AbstractC09560e7.A00(r4)
        L77:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0A(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0B(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 22
            boolean r0 = X.C9CY.A00(r10, r3)
            if (r0 == 0) goto L28
            r7 = r10
            X.9CY r7 = (X.C9CY) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r7.A00
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L36
            if (r3 == r1) goto L54
            if (r3 != r2) goto L2e
            java.lang.Object r5 = r7.A01
            goto L65
        L28:
            X.9CY r7 = new X.9CY
            r7.<init>(r8, r10, r3)
            goto L16
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L58
            X.2PV r0 = r8.A01
            r7.A00 = r1
            java.lang.Object r0 = r0.A0B(r9, r7)
            if (r0 != r4) goto L57
            return r4
        L54:
            X.AbstractC09560e7.A00(r0)
        L57:
            return r0
        L58:
            X.2PV r0 = r8.A01     // Catch: java.lang.Throwable -> L6b
            r7.A01 = r5     // Catch: java.lang.Throwable -> L6b
            r7.A00 = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.A0B(r9, r7)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r4) goto L68
            return r4
        L65:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6d
        L68:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6d
            return r0
        L6b:
            r4 = move-exception
            goto L6e
        L6d:
            r4 = move-exception
        L6e:
            r3 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r2 = X.C18950wb.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r2.AEr(r1, r0, r3, r6)
            r0.ERI(r4)
            r0.report()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0B(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(2:19|20))(2:21|(2:23|(1:25)(1:20))(4:26|(1:28)|13|14))|29|30|31))|32|6|7|(0)(0)|29|30|31|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 24
            boolean r0 = X.C9CY.A00(r9, r3)
            if (r0 == 0) goto L27
            r5 = r9
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r5.A00
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L35
            if (r3 == r1) goto L51
            if (r3 != r2) goto L2d
            java.lang.Object r6 = r5.A01
            goto L62
        L27:
            X.9CY r5 = new X.9CY
            r5.<init>(r7, r9, r3)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r0)
            X.5JK r6 = X.C5JK.A05
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L55
            X.2PV r0 = r7.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0D(r8, r5)
            if (r0 != r4) goto L54
            return r4
        L51:
            X.AbstractC09560e7.A00(r0)
        L54:
            return r0
        L55:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L68
            r5.A01 = r6     // Catch: java.lang.Throwable -> L68
            r5.A00 = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.A0D(r8, r5)     // Catch: java.lang.Throwable -> L68
            if (r0 != r4) goto L65
            return r4
        L62:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L68
        L65:
            X.5JK r0 = (X.C5JK) r0     // Catch: java.lang.Throwable -> L68
            return r0
        L68:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0D(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0E(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 32
            boolean r0 = X.MAM.A02(r9, r3)
            if (r0 == 0) goto L25
            r4 = r9
            X.MAM r4 = (X.MAM) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r6 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L35
            if (r0 != r2) goto L2d
            goto L5e
        L25:
            r0 = 42
            X.MAM r4 = new X.MAM
            r4.<init>(r7, r9, r3, r0)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r6)
            return r6
        L39:
            X.AbstractC09560e7.A00(r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            X.2PV r0 = r7.A01
            r4.A00 = r1
            java.lang.Object r6 = r0.A0E(r8, r4)
            if (r6 != r3) goto L7c
            return r3
        L53:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L64
            r4.A00 = r2     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r0.A0E(r8, r4)     // Catch: java.lang.Throwable -> L64
            if (r6 != r3) goto L61
            return r3
        L5e:
            X.AbstractC09560e7.A00(r6)     // Catch: java.lang.Throwable -> L64
        L61:
            X.O7S r6 = (X.O7S) r6     // Catch: java.lang.Throwable -> L64
            return r6
        L64:
            r5 = move-exception
            r6 = 0
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0E(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0H(java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 29
            boolean r0 = X.C9CY.A00(r10, r3)
            if (r0 == 0) goto L28
            r7 = r10
            X.9CY r7 = (X.C9CY) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r7.A00
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L36
            if (r3 == r1) goto L54
            if (r3 != r2) goto L2e
            java.lang.Object r5 = r7.A01
            goto L65
        L28:
            X.9CY r7 = new X.9CY
            r7.<init>(r8, r10, r3)
            goto L16
        L2e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L36:
            X.AbstractC09560e7.A00(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            com.instagram.common.session.UserSession r0 = r8.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L58
            X.2PV r0 = r8.A01
            r7.A00 = r1
            java.lang.Object r0 = r0.A0H(r9, r7)
            if (r0 != r4) goto L57
            return r4
        L54:
            X.AbstractC09560e7.A00(r0)
        L57:
            return r0
        L58:
            X.2PV r0 = r8.A01     // Catch: java.lang.Throwable -> L6b
            r7.A01 = r5     // Catch: java.lang.Throwable -> L6b
            r7.A00 = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r0 = r0.A0H(r9, r7)     // Catch: java.lang.Throwable -> L6b
            if (r0 != r4) goto L68
            return r4
        L65:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6d
        L68:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6d
            return r0
        L6b:
            r4 = move-exception
            goto L6e
        L6d:
            r4 = move-exception
        L6e:
            r3 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r2 = X.C18950wb.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r2.AEr(r1, r0, r3, r6)
            r0.ERI(r4)
            r0.report()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0H(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0I(java.lang.String r7, X.InterfaceC23621Ds r8, int r9) {
        /*
            r6 = this;
            r3 = 8
            boolean r0 = X.C9CX.A00(r8, r3)
            if (r0 == 0) goto L25
            r5 = r8
            X.9CX r5 = (X.C9CX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L74
            if (r0 != r2) goto L31
            goto L2d
        L25:
            r0 = 42
            X.9CX r5 = new X.9CX
            r5.<init>(r6, r8, r3, r0)
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5c
            goto L77
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0I(r7, r5, r9)
        L50:
            if (r0 != r3) goto L77
            return r3
        L53:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.A0I(r7, r5, r9)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L5c:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L77
        L74:
            X.AbstractC09560e7.A00(r4)
        L77:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0I(java.lang.String, X.1Ds, int):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(3:23|(1:25)|26)|(1:22))|15|16))|29|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r4);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0J(java.lang.String r8, X.InterfaceC23621Ds r9, boolean r10) {
        /*
            r7 = this;
            r3 = 34
            boolean r0 = X.MAM.A02(r9, r3)
            if (r0 == 0) goto L26
            r4 = r9
            X.MAM r4 = (X.MAM) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r6 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r5 = 0
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L77
            if (r0 != r2) goto L32
            goto L2e
        L26:
            r0 = 42
            X.MAM r4 = new X.MAM
            r4.<init>(r7, r9, r3, r0)
            goto L16
        L2e:
            X.AbstractC09560e7.A00(r6)     // Catch: java.lang.Throwable -> L60
            goto L7a
        L32:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3a:
            X.AbstractC09560e7.A00(r6)
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L54
            X.2PV r0 = r7.A01
            r4.A00 = r1
            java.lang.Object r0 = r0.A0J(r8, r4, r10)
        L51:
            if (r0 != r3) goto L7a
            return r3
        L54:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L60
            if (r10 != 0) goto L59
            r1 = 0
        L59:
            r4.A00 = r2     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.A0J(r8, r4, r1)     // Catch: java.lang.Throwable -> L60
            goto L51
        L60:
            r4 = move-exception
            r3 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r2 = X.C18950wb.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r2.AEr(r1, r0, r3, r5)
            r0.ERI(r4)
            r0.report()
            goto L7a
        L77:
            X.AbstractC09560e7.A00(r6)
        L7a:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0J(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0K(java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 31
            boolean r0 = X.MAM.A02(r8, r3)
            if (r0 == 0) goto L25
            r5 = r8
            X.MAM r5 = (X.MAM) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L74
            if (r0 != r2) goto L31
            goto L2d
        L25:
            r0 = 42
            X.MAM r5 = new X.MAM
            r5.<init>(r6, r8, r3, r0)
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5c
            goto L77
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0K(r7, r5)
        L50:
            if (r0 != r3) goto L77
            return r3
        L53:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.A0K(r7, r5)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L5c:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L77
        L74:
            X.AbstractC09560e7.A00(r4)
        L77:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0K(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:14)(2:11|12))(1:17))(3:18|(1:20)(1:23)|(1:22))|15|16))|26|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0 = X.C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
        r0.ERI(r5);
        r0.report();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0L(java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 35
            boolean r0 = X.MAM.A02(r8, r3)
            if (r0 == 0) goto L25
            r5 = r8
            X.MAM r5 = (X.MAM) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L74
            if (r0 != r2) goto L31
            goto L2d
        L25:
            r0 = 42
            X.MAM r5 = new X.MAM
            r5.<init>(r6, r8, r3, r0)
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r4)     // Catch: java.lang.Throwable -> L5c
            goto L77
        L31:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L39:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r6.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            X.2PV r0 = r6.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0L(r7, r5)
        L50:
            if (r0 != r3) goto L77
            return r3
        L53:
            X.2PV r0 = r6.A01     // Catch: java.lang.Throwable -> L5c
            r5.A00 = r2     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r0 = r0.A0L(r7, r5)     // Catch: java.lang.Throwable -> L5c
            goto L50
        L5c:
            r5 = move-exception
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            goto L77
        L74:
            X.AbstractC09560e7.A00(r4)
        L77:
            X.0eB r3 = X.C0eB.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0L(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // X.C2PV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0M(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 23
            boolean r0 = X.C9CY.A00(r8, r3)
            if (r0 == 0) goto L27
            r5 = r8
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r3 = r5.A00
            r2 = 2
            r1 = 1
            if (r3 == 0) goto L35
            if (r3 == r1) goto L51
            if (r3 != r2) goto L2d
            java.lang.Object r6 = r5.A01
            goto L62
        L27:
            X.9CY r5 = new X.9CY
            r5.<init>(r7, r8, r3)
            goto L16
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r0)
            X.0sl r6 = X.C16930sl.A00
            com.instagram.common.session.UserSession r0 = r7.A00
            java.lang.Boolean r0 = X.C2Q7.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L55
            X.2PV r0 = r7.A01
            r5.A00 = r1
            java.lang.Object r0 = r0.A0M(r5)
            if (r0 != r4) goto L54
            return r4
        L51:
            X.AbstractC09560e7.A00(r0)
        L54:
            return r0
        L55:
            X.2PV r0 = r7.A01     // Catch: java.lang.Throwable -> L68
            r5.A01 = r6     // Catch: java.lang.Throwable -> L68
            r5.A00 = r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.A0M(r5)     // Catch: java.lang.Throwable -> L68
            if (r0 != r4) goto L65
            return r4
        L62:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L6a
        L65:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L6a
            return r0
        L68:
            r5 = move-exception
            goto L6b
        L6a:
            r5 = move-exception
        L6b:
            r4 = 817899173(0x30c026a5, float:1.3980822E-9)
            X.0f6 r3 = X.C18950wb.A00
            r2 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "clips_draft_dao_errors"
            X.0f5 r0 = r3.AEr(r1, r0, r4, r2)
            r0.ERI(r5)
            r0.report()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.datasource.clips.ClipsDraftDaoWithSoftFail.A0M(X.1Ds):java.lang.Object");
    }

    @Override // X.C2PV
    public final List A0O() {
        List list = C16930sl.A00;
        if (!C2Q7.A00(this.A00).booleanValue()) {
            return this.A01.A0O();
        }
        try {
            list = this.A01.A0O();
            return list;
        } catch (Throwable th) {
            C0f5 AEr = C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
            AEr.ERI(th);
            AEr.report();
            return list;
        }
    }

    @Override // X.C2PV
    public final InterfaceC19390xP A0P() {
        InterfaceC19390xP interfaceC19390xP = C16450rq.A00;
        if (!C2Q7.A00(this.A00).booleanValue()) {
            return this.A01.A0P();
        }
        try {
            interfaceC19390xP = this.A01.A0P();
            return interfaceC19390xP;
        } catch (Throwable th) {
            C0f5 AEr = C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
            AEr.ERI(th);
            AEr.report();
            return interfaceC19390xP;
        }
    }

    @Override // X.C2PV
    public final InterfaceC19390xP A0Q() {
        InterfaceC19390xP interfaceC19390xP = C16450rq.A00;
        if (!C2Q7.A00(this.A00).booleanValue()) {
            return this.A01.A0Q();
        }
        try {
            interfaceC19390xP = this.A01.A0Q();
            return interfaceC19390xP;
        } catch (Throwable th) {
            C0f5 AEr = C18950wb.A00.AEr(false, "clips_draft_dao_errors", 817899173, 0);
            AEr.ERI(th);
            AEr.report();
            return interfaceC19390xP;
        }
    }

    public ClipsDraftDaoWithSoftFail(UserSession userSession, C2PV c2pv) {
        this.A01 = c2pv;
        this.A00 = userSession;
    }
}
