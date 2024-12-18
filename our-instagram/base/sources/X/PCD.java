package X;

import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PCD implements InterfaceC57985PnV {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final View A06;
    public final AbstractC10360h2 A07;
    public final UserSession A08;
    public final InterfaceC09390do A0A = C57513Pfn.A00(this, 31);
    public final InterfaceC09390do A0B = C57513Pfn.A00(this, 32);
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C57513Pfn(this, 30));

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51893Mwb c51893Mwb = (C51893Mwb) interfaceC57856PlM;
        C14360o3.A0B(c51893Mwb, 0);
        if (c51893Mwb.A06) {
            this.A02 = c51893Mwb.A02;
            this.A00 = c51893Mwb.A00;
            this.A01 = c51893Mwb.A01;
            this.A05 = c51893Mwb.A05;
            this.A03 = c51893Mwb.A03;
            this.A04 = c51893Mwb.A04;
            InterfaceC09390do interfaceC09390do = this.A0B;
            View A0d = AbstractC166987dD.A0d(interfaceC09390do);
            if (A0d.isLaidOut() && !A0d.isLayoutRequested()) {
                ViewParent parent = AbstractC166987dD.A0d(interfaceC09390do).getParent();
                View findViewById = this.A06.findViewById(R.id.bloks_fragment_container);
                AbstractC10360h2 abstractC10360h2 = this.A07;
                Fragment A0O = abstractC10360h2.A0O(R.id.bloks_fragment_container);
                List<InterfaceC08430c6> A04 = abstractC10360h2.A0U.A04();
                C14360o3.A07(A04);
                int A0L = abstractC10360h2.A0L();
                String str = null;
                InterfaceC08430c6 interfaceC08430c6 = null;
                for (InterfaceC08430c6 interfaceC08430c62 : A04) {
                    if (interfaceC08430c62 instanceof C72743Nv) {
                        interfaceC08430c6 = interfaceC08430c62;
                    }
                }
                try {
                    InterfaceC09390do interfaceC09390do2 = this.A09;
                    if (!C14360o3.A0K(A0O, interfaceC09390do2.getValue())) {
                        C14240no c14240no = new C14240no(abstractC10360h2);
                        c14240no.A0A((Fragment) interfaceC09390do2.getValue(), R.id.bloks_fragment_container);
                        c14240no.A06();
                        AbstractC166987dD.A0d(interfaceC09390do).setFitsSystemWindows(true);
                        AbstractC008903d.A00(AbstractC166987dD.A0d(interfaceC09390do), C55542Olc.A00);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    StringBuilder A0n = AbstractC50522MSa.A0n(parent, findViewById, A0O, A0L);
                    Iterator it = A04.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    A0n.append(C0eB.A00);
                    A0n.append(" \nBloksSreenFragment: ");
                    C72743Nv c72743Nv = (C72743Nv) interfaceC08430c6;
                    if (c72743Nv != null) {
                        str = c72743Nv.getUrl();
                    }
                    A0n.append(str);
                    C0w9.A07("RtcCoWatchBloksContentPickerViewHolder", new IllegalArgumentException(AbstractC166997dE.A0x(" \n", A0n), e));
                    return;
                }
            }
            ViewOnLayoutChangeListenerC55476OkV.A00(A0d, 7, this);
        }
    }

    public PCD(View view, AbstractC10360h2 abstractC10360h2, UserSession userSession) {
        this.A07 = abstractC10360h2;
        this.A06 = view;
        this.A08 = userSession;
    }
}
