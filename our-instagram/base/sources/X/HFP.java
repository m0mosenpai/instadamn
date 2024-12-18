package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class HFP extends AbstractC65632xz {
    public final Context A00;
    public final UserSession A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(793329822);
        C41181vS c41181vS = (C41181vS) obj;
        C41085IHc c41085IHc = (C41085IHc) view.getTag();
        if (c41085IHc != null) {
            UserSession userSession = this.A01;
            C101394gx A00 = AbstractC140306Wi.A00(c41181vS);
            A00.getClass();
            List A01 = AbstractC37865GlK.A01(A00);
            int[] A04 = AbstractC140306Wi.A04(userSession, A00, false);
            int A002 = I5H.A00(A00.A02);
            Context context = c41085IHc.A00;
            int color = context.getColor(A002);
            int size = A01.size();
            LayoutInflater from = LayoutInflater.from(context);
            LinearLayout linearLayout = c41085IHc.A01;
            int childCount = size - linearLayout.getChildCount();
            int i2 = 0;
            int i3 = -childCount;
            if (childCount >= 0) {
                while (i2 < childCount) {
                    View inflate = from.inflate(R.layout.reel_dashboard_poll_v2_result_option_row, (ViewGroup) linearLayout, false);
                    c41085IHc.A02.add(new IKL(inflate));
                    linearLayout.addView(inflate);
                    i2++;
                }
            } else {
                while (i2 < i3) {
                    linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                    List list = c41085IHc.A02;
                    list.remove(AbstractC25226BEj.A05(list));
                    i2++;
                }
            }
            int i4 = 0;
            while (true) {
                List list2 = c41085IHc.A02;
                if (i4 >= list2.size()) {
                    break;
                }
                IKL ikl = (IKL) list2.get(i4);
                InterfaceC101384gv interfaceC101384gv = (InterfaceC101384gv) A01.get(i4);
                int i5 = A04[i4];
                String A06 = AbstractC13670mt.A06("%s %s", interfaceC101384gv.getText(), AbstractC167007dF.A0f(ikl.A00, interfaceC101384gv.Arz(), 2131969733));
                String A062 = AbstractC13670mt.A06("%d%%", AbstractC25228BEl.A1Y(i5));
                ikl.A01.setColors(new int[]{color, color});
                ikl.A05.setText(A06);
                ikl.A04.setText(A06);
                ikl.A07.setText(A062);
                ikl.A06.setText(A062);
                View view2 = ikl.A02;
                view2.setClipBounds(new Rect(0, 0, (int) (view2.getWidth() * (i5 / 100.0f)), view2.getHeight()));
                i4++;
            }
        }
        C0f9.A0A(-1094313502, A03);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C101394gx A00 = AbstractC140306Wi.A00((C41181vS) obj);
        A00.getClass();
        return AbstractC37865GlK.A00(A00).hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AbstractC140306Wi.A02(this.A01, (C41181vS) obj).hashCode();
    }

    public HFP(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-562634164);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.reel_dashboard_poll_v2_result);
        A0A.setTag(new C41085IHc(A0A));
        C0f9.A0A(1243472105, A03);
        return A0A;
    }
}
