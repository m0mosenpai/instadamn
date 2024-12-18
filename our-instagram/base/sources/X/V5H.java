package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout2;
import java.util.List;

/* loaded from: classes11.dex */
public final class V5H extends AbstractC66412zI {
    public final InterfaceC71918XAc A00;
    public final boolean A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        boolean z = this.A01;
        int i2 = R.layout.tab_bar;
        if (z) {
            i2 = R.layout.tab_bar_prism;
        }
        return new C66454UIe(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i2, false), z);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        TextView textView;
        String str;
        boolean z;
        C70798WhE c70798WhE = (C70798WhE) interfaceC66482zP;
        C66454UIe c66454UIe = (C66454UIe) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c70798WhE, c66454UIe);
        if (this.A01) {
            IgSegmentedTabLayout2 igSegmentedTabLayout2 = c66454UIe.A01;
            if (igSegmentedTabLayout2 != null) {
                C68974VfC c68974VfC = c70798WhE.A01;
                EnumC68206VFy enumC68206VFy = c70798WhE.A02;
                InterfaceC71918XAc interfaceC71918XAc = this.A00;
                C14360o3.A0B(interfaceC71918XAc, 3);
                List list = c68974VfC.A01;
                C44436Jks c44436Jks = igSegmentedTabLayout2.A04;
                if (c44436Jks.getChildCount() != list.size()) {
                    c44436Jks.removeAllViews();
                    c44436Jks.A02 = -1;
                    c44436Jks.A00 = -1;
                    z = true;
                } else {
                    z = false;
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    W4N w4n = (W4N) list.get(i);
                    if (z) {
                        String str2 = w4n.A02;
                        if (str2 != null) {
                            igSegmentedTabLayout2.A01(new WNP(25, interfaceC71918XAc, w4n), new C47673L3g(null, str2, null, -1, A1a));
                        }
                    }
                    if (w4n.A00() == enumC68206VFy) {
                        igSegmentedTabLayout2.A00(i, A1a);
                    }
                }
                return;
            }
            return;
        }
        ViewGroup viewGroup = c66454UIe.A00;
        if (viewGroup != null) {
            C68974VfC c68974VfC2 = c70798WhE.A01;
            EnumC68206VFy enumC68206VFy2 = c70798WhE.A02;
            InterfaceC71918XAc interfaceC71918XAc2 = this.A00;
            C14360o3.A0B(interfaceC71918XAc2, 3);
            List list2 = c68974VfC2.A01;
            int size2 = list2.size();
            int i2 = 0;
            while (true) {
                boolean z2 = true;
                if (i2 < size2) {
                    W4N w4n2 = (W4N) list2.get(i2);
                    if (i2 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i2);
                        C14360o3.A0C(childAt, AbstractC111324zv.A00(3));
                        textView = (TextView) childAt;
                    } else {
                        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.button_group_tab);
                        C14360o3.A0C(A0A, AbstractC111324zv.A00(3));
                        textView = (TextView) A0A;
                        viewGroup.addView(textView);
                    }
                    String str3 = w4n2.A02;
                    if (str3 == null) {
                        break;
                    }
                    textView.setText(str3);
                    String str4 = w4n2.A01;
                    if (str4 != null) {
                        textView.setContentDescription(str4);
                        if (w4n2.A00() != enumC68206VFy2) {
                            z2 = false;
                        }
                        textView.setSelected(z2);
                        WNP.A00(textView, 26, interfaceC71918XAc2, w4n2);
                        i2++;
                    } else {
                        str = "contentDescription";
                        break;
                    }
                } else {
                    int childCount = viewGroup.getChildCount() - (A1a ? 1 : 0);
                    int size3 = list2.size();
                    if (size3 > childCount) {
                        return;
                    }
                    while (true) {
                        viewGroup.removeViewAt(childCount);
                        if (childCount == size3) {
                            return;
                        } else {
                            childCount--;
                        }
                    }
                }
            }
        } else {
            return;
        }
        str = DialogModule.KEY_TITLE;
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70798WhE.class;
    }

    public V5H(UserSession userSession, InterfaceC71918XAc interfaceC71918XAc) {
        AbstractC167017dG.A1P(interfaceC71918XAc, userSession);
        this.A00 = interfaceC71918XAc;
        this.A01 = C18U.A06(C06090Tz.A05, userSession, 36326713130563631L);
    }
}
