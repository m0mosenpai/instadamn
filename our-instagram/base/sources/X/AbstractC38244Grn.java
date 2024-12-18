package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Grn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38244Grn implements JIM {
    public C120985dq A00;
    public C37644Ghd A01;
    public JIL A02;
    public final UserSession A03;
    public final String A04;

    @Override // X.JIM
    public final void Eb1(float f) {
    }

    @Override // X.JIM
    public final boolean Cfm() {
        JIL jil = this.A02;
        if (jil != null) {
            return jil.isPlaying();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r2 == false) goto L8;
     */
    @Override // X.JIM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EE4(java.lang.String r7) {
        /*
            r6 = this;
            X.JIL r5 = r6.A02
            r4 = 0
            if (r5 == 0) goto L23
            r5.stop()
            com.instagram.common.session.UserSession r3 = r6.A03
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320506904257132(0x81094f0017226c, double:3.032573044970041E-306)
            boolean r2 = X.C18U.A06(r2, r3, r0)
            java.lang.String r0 = "fragment_paused"
            if (r7 == r0) goto L1c
            r1 = 1
            if (r2 != 0) goto L1d
        L1c:
            r1 = 0
        L1d:
            r0 = 0
            r5.EJY(r3, r0, r1, r2)
            r6.A02 = r4
        L23:
            r6.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38244Grn.EE4(java.lang.String):void");
    }

    @Override // X.JIM
    public final void EMg(int i, boolean z) {
        if (this instanceof C39489HcH) {
            C4QW c4qw = ((C39489HcH) this).A00;
            if (c4qw != null) {
                c4qw.EMg(i, z);
                return;
            }
            return;
        }
        JIL jil = this.A02;
        if (jil == null) {
            return;
        }
        jil.seekTo(i);
    }

    @Override // X.JIM
    public final void EMl() {
        JIL jil = this.A02;
        if (jil != null) {
            jil.seekTo(0);
        }
    }

    public AbstractC38244Grn(UserSession userSession, String str) {
        this.A03 = userSession;
        this.A04 = str;
    }
}
