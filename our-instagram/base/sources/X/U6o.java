package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes11.dex */
public final class U6o extends AbstractC65632xz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        C66270U6p c66270U6p = (C66270U6p) obj;
        C69179Vj8 c69179Vj8 = c66270U6p.A01;
        if (c69179Vj8 != null) {
            int intValue = c69179Vj8.A01.intValue();
            i = 1;
            if (intValue != 9 && intValue != 10) {
                anonymousClass306.A7a(2);
                return;
            }
        } else {
            i = 0;
            if (c66270U6p.A02 != null) {
                i = 3;
            }
        }
        anonymousClass306.A7a(i);
    }

    public U6o(Context context, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        ReelDashboardFragment reelDashboardFragment;
        C69179Vj8 c69179Vj8;
        View view2;
        int i2;
        int A03 = C0f9.A03(1942681334);
        C66270U6p c66270U6p = (C66270U6p) obj;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C69181VjA c69181VjA = (C69181VjA) AbstractC31172DnG.A0x(view);
                        AbstractC25230BEn.A15(1, c69181VjA, c66270U6p);
                        c69181VjA.A00.setBackground(c66270U6p.A00);
                        c69181VjA.A02.setText(c66270U6p.A03);
                        c69181VjA.A01.setText(c66270U6p.A02);
                    } else {
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                        C0f9.A0A(-32444664, A03);
                        throw unsupportedOperationException;
                    }
                } else {
                    C69180Vj9 c69180Vj9 = (C69180Vj9) AbstractC31172DnG.A0x(view);
                    reelDashboardFragment = this.A01;
                    AbstractC25230BEn.A15(1, c69180Vj9, c66270U6p);
                    C14360o3.A0B(reelDashboardFragment, 2);
                    c69179Vj8 = c66270U6p.A01;
                    c69180Vj9.A00.setBackground(c66270U6p.A00);
                    c69180Vj9.A01.setText(c66270U6p.A03);
                    view2 = c69180Vj9.A02;
                    i2 = 41;
                }
            } else {
                C69256VkP c69256VkP = (C69256VkP) AbstractC31172DnG.A0x(view);
                reelDashboardFragment = this.A01;
                c69179Vj8 = c66270U6p.A01;
                c69179Vj8.getClass();
                c69256VkP.A00.setBackground(c66270U6p.A00);
                c69256VkP.A03.setText(c66270U6p.A03);
                c69256VkP.A02.setText(c69179Vj8.A02);
                view2 = c69256VkP.A01;
                i2 = 40;
            }
            C0fQ.A00(new WNW(c69179Vj8, reelDashboardFragment, i2), view2);
        } else {
            TextView textView = ((C68870VdQ) AbstractC31172DnG.A0x(view)).A00;
            textView.setText(c66270U6p.A03);
            textView.setBackground(c66270U6p.A00);
        }
        C0f9.A0A(2082944294, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0A;
        int i2;
        int A03 = C0f9.A03(-72373177);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title_with_subtitle);
                        C14360o3.A0A(A0A);
                        A0A.setTag(new C69181VjA(A0A));
                        i2 = -1913416808;
                    } else {
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                        C0f9.A0A(-1783450587, A03);
                        throw unsupportedOperationException;
                    }
                } else {
                    A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title_with_info_icon);
                    C14360o3.A0A(A0A);
                    A0A.setTag(new C69180Vj9(A0A));
                    i2 = 168937750;
                }
            } else {
                A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title_with_cta);
                A0A.setTag(new C69256VkP(A0A));
                i2 = -2039687310;
            }
        } else {
            A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_section_title);
            A0A.setTag(new C68870VdQ((TextView) A0A));
            i2 = 972840885;
        }
        C0f9.A0A(i2, A03);
        return A0A;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
