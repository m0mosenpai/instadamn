package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.Date;
import java.util.List;

/* renamed from: X.Gu4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38368Gu4 extends C2UU {
    public final C42509Iro A00;
    public final UserSession A05;
    public final InterfaceC62602sz A06;
    public final String A07;
    public final C8SI A04 = new C8SI(2);
    public final List A02 = AbstractC166987dD.A1E();
    public final List A03 = AbstractC166987dD.A1E();
    public final List A01 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new C38493GwE(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.countdown_home_sticker_list_item, viewGroup, false), this.A05, this.A00);
                }
                throw AbstractC166987dD.A12(AbstractC111324zv.A00(3269));
            }
            return new C38412Gun(LoadMoreButton.A00(viewGroup.getContext(), R.layout.countdown_home_empty_state_item, viewGroup));
        }
        View inflate = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.countdown_home_create_list_item, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.create_button);
        findViewById.getClass();
        C3P9 A0s = AbstractC166987dD.A0s(findViewById);
        A0s.A07 = true;
        C37846Gl0.A00(A0s, this, 9);
        return new C3OO(inflate);
    }

    public C38368Gu4(UserSession userSession, C42509Iro c42509Iro, InterfaceC62602sz interfaceC62602sz, String str) {
        this.A05 = userSession;
        setHasStableIds(true);
        this.A06 = interfaceC62602sz;
        this.A00 = c42509Iro;
        this.A07 = str;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1777396908);
        int size = this.A01.size() + 1 + 1;
        C0f9.A0A(1586701833, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long A00;
        int i2;
        int A03 = C0f9.A03(-283831042);
        if (i == 0) {
            A00 = 0;
            i2 = 1238255657;
        } else if (i == getItemCount() - 1) {
            A00 = 1;
            i2 = 1494526216;
        } else {
            AlC alC = (AlC) this.A01.get(i - 1);
            C8SI c8si = this.A04;
            String str = alC.A00.A06;
            str.getClass();
            A00 = c8si.A00(str);
            i2 = 1784156453;
        }
        C0f9.A0A(i2, A03);
        return A00;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(389493472);
        if (i == 0) {
            i2 = 0;
            i3 = -1492856908;
        } else {
            i2 = 1;
            if (i == getItemCount() - 1) {
                i3 = -302147905;
            } else {
                i2 = 2;
                i3 = -852024603;
            }
        }
        C0f9.A0A(i3, A03);
        return i2;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        if (getItemViewType(i) == 2) {
            C38493GwE c38493GwE = (C38493GwE) c3oo;
            AlC alC = (AlC) this.A01.get(i - 1);
            String str = this.A07;
            c38493GwE.A00 = alC;
            C220919pF c220919pF = new C220919pF(c38493GwE.A01, c38493GwE.A03, alC, str);
            C220799p3 c220799p3 = c220919pF.A01;
            Drawable drawable = c220799p3.A07.getDrawable(R.drawable.instagram_more_horizontal_pano_outline_24);
            if (drawable != null) {
                c220799p3.A00 = drawable;
                c220799p3.invalidateSelf();
                ChoreographerFrameCallbackC45694KKg choreographerFrameCallbackC45694KKg = c220799p3.A09;
                Date date = choreographerFrameCallbackC45694KKg.A03;
                if (date != null && date.before(new Date())) {
                    choreographerFrameCallbackC45694KKg.A02 = C05F.A01;
                    ChoreographerFrameCallbackC45694KKg.A00(choreographerFrameCallbackC45694KKg);
                }
                c220799p3.invalidateSelf();
                ImageView imageView = c38493GwE.A02;
                imageView.setImageDrawable(c220919pF);
                String str2 = c38493GwE.A00.A00.A0B;
                if (str2 == null) {
                    str2 = "";
                }
                imageView.setContentDescription(str2);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        if (getItemViewType(i) != 1) {
            return;
        }
        InterfaceC62602sz interfaceC62602sz = this.A06;
        C14360o3.A0B(interfaceC62602sz, 0);
        ((C38412Gun) c3oo).A00.A04(interfaceC62602sz, null);
    }
}
