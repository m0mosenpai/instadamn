package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.venue.Venue;

/* loaded from: classes6.dex */
public final class ERA extends AbstractC65632xz {
    public final N5Z A00;
    public final boolean A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        if (obj instanceof Venue) {
            i = 0;
        } else if (obj instanceof EnumC33327EoM) {
            i = 1;
        } else {
            throw new UnsupportedOperationException();
        }
        anonymousClass306.A7a(i);
    }

    public ERA(N5Z n5z, boolean z) {
        this.A00 = n5z;
        this.A01 = z;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1818537103);
        if (i != 0) {
            if (i == 1) {
                C33603EtF c33603EtF = (C33603EtF) AbstractC31172DnG.A0x(view);
                C14360o3.A0B(c33603EtF, 0);
                c33603EtF.A01.setText(2131968577);
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                C0f9.A0A(613757879, A03);
                throw unsupportedOperationException;
            }
        } else {
            Venue venue = (Venue) obj;
            C34598FMh c34598FMh = (C34598FMh) AbstractC31172DnG.A0x(view);
            N5Z n5z = this.A00;
            boolean z = this.A01;
            C14360o3.A0B(c34598FMh, 0);
            AbstractC167017dG.A1P(venue, n5z);
            c34598FMh.A04.setText(venue.A00.getName());
            c34598FMh.A00.setVisibility(8);
            c34598FMh.A02.setVisibility(AbstractC167007dF.A05(n5z.A0U ? 1 : 0));
            String address = venue.A00.getAddress();
            if (address != null && address.length() != 0) {
                TextView textView = c34598FMh.A03;
                textView.setText(venue.A00.getAddress());
                textView.setVisibility(0);
            } else {
                c34598FMh.A03.setVisibility(8);
            }
            View view2 = c34598FMh.A01;
            C0fQ.A00(new ViewOnClickListenerC55464OkJ(69, venue, n5z), view2);
            if (z) {
                view2.setBackground(null);
            }
        }
        C0f9.A0A(-1644468071, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        int i2;
        int A03 = C0f9.A03(220848562);
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (i != 0) {
            if (i == 1) {
                A0C = FC2.A00(A0P, viewGroup);
                i2 = -93093454;
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                C0f9.A0A(562943766, A03);
                throw unsupportedOperationException;
            }
        } else {
            C14360o3.A0B(A0P, 0);
            A0C = AbstractC31173DnH.A0C(A0P, viewGroup, R.layout.row_venue, false);
            A0C.setTag(new C34598FMh(A0C));
            i2 = 552295785;
        }
        C0f9.A0A(i2, A03);
        return A0C;
    }
}
