package com.instagram.bugreporter;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25229BEm;
import X.AbstractC31173DnH;
import X.AbstractC31177DnL;
import X.AbstractC43591JPw;
import X.C023409i;
import X.C09Y;
import X.C54748OGw;
import X.InterfaceC58266PsA;
import X.MC8;
import X.OO8;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes9.dex */
public final class BugReporterActivity extends ModalActivity {
    public InterfaceC58266PsA A00 = new Object();

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        C54748OGw c54748OGw = new C54748OGw(getSession(), AbstractC43591JPw.A00(548));
        Fragment A0I = AbstractC31177DnL.A0I(this);
        InterfaceC58266PsA A00 = OO8.A00(AbstractC31173DnH.A0A(this), getSession());
        this.A00 = A00;
        if (A0I == null) {
            A00.AW9("bug_reporter_activity");
            Bundle A0A = AbstractC31173DnH.A0A(this);
            if (A0A != null) {
                AbstractC166987dD.A1Z(new MC8(c54748OGw, this, A0A, null, 15), AbstractC25229BEm.A0a(this));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            return c09y.A04(A0A);
        }
        throw AbstractC166997dE.A0g();
    }
}
