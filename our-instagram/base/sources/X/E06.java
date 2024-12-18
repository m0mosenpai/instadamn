package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class E06 extends C2UU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public final Context A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C57112jm A09;
    public final C32260EIu A0A;
    public final ArrayList A0B;
    public final HashMap A0C;
    public final HashMap A0D;

    public E06(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C32260EIu c32260EIu) {
        C14360o3.A0B(userSession, 2);
        this.A06 = context;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0A = c32260EIu;
        this.A09 = c57112jm;
        this.A0B = AbstractC166987dD.A1E();
        this.A0D = AbstractC166987dD.A1G();
        this.A0C = AbstractC166987dD.A1G();
    }

    public static final int A00(E06 e06, int i) {
        for (int i2 = i; i2 >= 0; i2--) {
            if (e06.getItemViewType(i2) == 0) {
                return (i - i2) - 1;
            }
        }
        return -1;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i == 0) {
            return new C31920E1a(AbstractC25227BEk.A0D(LayoutInflater.from(this.A06), viewGroup, R.layout.interest_header, false));
        }
        if (i != 1 && i != 3) {
            if (i == 2) {
                return new C31921E1b(AbstractC25227BEk.A0D(LayoutInflater.from(this.A06), viewGroup, R.layout.see_more_with_chevron_row, false));
            }
            throw new UnsupportedOperationException("Unknown view type");
        }
        return new C31994E3w(AbstractC25227BEk.A0D(LayoutInflater.from(this.A06), viewGroup, R.layout.interest_recommendation_item, false));
    }

    public static final String A01(E06 e06, String str) {
        Number A0W;
        if (str != null && (A0W = AbstractC31171DnF.A0W(str, e06.A0D)) != null && A0W.intValue() == 2) {
            return "from_your_contacts";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
    
        if (r1 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016a, code lost:
    
        if (r9 == 3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r29, int r30) {
        /*
            Method dump skipped, instructions count: 961
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E06.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1130597754);
        int size = this.A0B.size();
        C0f9.A0A(1043904722, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(1568982358);
        ArrayList arrayList = this.A0B;
        if (arrayList.get(i) instanceof String) {
            i2 = 0;
            i3 = -545630706;
        } else if (arrayList.get(i) instanceof C115875Md) {
            i2 = 1;
            i3 = -992253871;
        } else {
            boolean z = arrayList.get(i) instanceof E8F;
            i2 = 2;
            i3 = 34527462;
            if (z) {
                i2 = 3;
                i3 = -747578101;
            }
        }
        C0f9.A0A(i3, A03);
        return i2;
    }
}
