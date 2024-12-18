package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fpi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLongClickListenerC35708Fpi implements View.OnLongClickListener {
    public final /* synthetic */ C31637Dv3 A00;
    public final /* synthetic */ C31446Drq A01;
    public final /* synthetic */ C32083E8h A02;
    public final /* synthetic */ C43767JXg A03;
    public final /* synthetic */ DirectShareTarget A04;
    public final /* synthetic */ String A05;

    public ViewOnLongClickListenerC35708Fpi(C31637Dv3 c31637Dv3, C31446Drq c31446Drq, C32083E8h c32083E8h, C43767JXg c43767JXg, DirectShareTarget directShareTarget, String str) {
        this.A03 = c43767JXg;
        this.A00 = c31637Dv3;
        this.A04 = directShareTarget;
        this.A05 = str;
        this.A02 = c32083E8h;
        this.A01 = c31446Drq;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C43767JXg c43767JXg = this.A03;
        ViewGroup viewGroup = c43767JXg.A07;
        viewGroup.requestDisallowInterceptTouchEvent(true);
        C31637Dv3 c31637Dv3 = this.A00;
        if (C18U.A06(C06090Tz.A05, c31637Dv3.A02, 36317908449105586L)) {
            DirectShareTarget directShareTarget = this.A04;
            if (directShareTarget.A04 != null) {
                c31637Dv3.A03.Dle(AbstractC13880nE.A0G(c43767JXg.A0O.A04), viewGroup, this.A01, directShareTarget, this.A05, this.A02.A03, false, false);
            }
        }
        return true;
    }
}
