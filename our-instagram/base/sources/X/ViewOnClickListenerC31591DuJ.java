package X;

import android.view.View;
import com.facebook.forker.Process;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import com.instagram.user.model.User;

/* renamed from: X.DuJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC31591DuJ implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC31591DuJ(C32280EJr c32280EJr, User user, int i) {
        this.A00 = i;
        switch (i) {
            case 59:
            case 60:
                this.A01 = c32280EJr;
                this.A02 = user;
                return;
            default:
                this.A01 = c32280EJr;
                this.A02 = user;
                return;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC31591DuJ(i, obj, obj2), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x05e9, code lost:
    
        if (r7.A26() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0e67, code lost:
    
        if (r1.booleanValue() == false) goto L295;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [X.GZx, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 3906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC31591DuJ.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC31591DuJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public ViewOnClickListenerC31591DuJ(EOM eom, HallPassMemberViewModel hallPassMemberViewModel, int i) {
        this.A00 = i;
        switch (i) {
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
                this.A02 = eom;
                this.A01 = hallPassMemberViewModel;
                break;
            default:
                this.A01 = eom;
                this.A02 = hallPassMemberViewModel;
                break;
        }
    }

    public ViewOnClickListenerC31591DuJ(EON eon, HallPassMemberViewModel hallPassMemberViewModel, int i) {
        this.A00 = i;
        switch (i) {
            case 22:
            case 24:
                this.A02 = eon;
                this.A01 = hallPassMemberViewModel;
                break;
            case 23:
                this.A01 = hallPassMemberViewModel;
                this.A02 = eon;
                break;
            default:
                this.A01 = eon;
                this.A02 = hallPassMemberViewModel;
                break;
        }
    }
}
