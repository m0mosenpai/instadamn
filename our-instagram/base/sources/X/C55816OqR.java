package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;

/* renamed from: X.OqR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55816OqR implements InterfaceC60122ou {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C55816OqR(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        TextView textView;
        if (this.A00 != 0) {
            C14360o3.A0B(interfaceC56362iU, 0);
            interfaceC56362iU.EkS(true);
            ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = ((C38672GzD) this.A01).A01;
            if (shoppingTaggingFeedHeader.A03) {
                C3LO A0B = AbstractC31171DnF.A0B();
                HCK hck = (HCK) this.A02;
                A0B.A0K = HCK.A01(hck, (C38329GtO) hck.A0B.getValue(), shoppingTaggingFeedHeader.A05);
                AbstractC31176DnK.A1B(new ViewOnClickListenerC42033Ik2(hck, 66), A0B, interfaceC56362iU);
            }
            if (shoppingTaggingFeedHeader.A06) {
                interfaceC56362iU.ESm(R.layout.tagging_feed_action_bar_shimmer, AbstractC53242c7.A0G(AbstractC31172DnG.A07(this.A02), R.attr.actionBarStartSpacing), 0, true);
                return;
            }
            String str = shoppingTaggingFeedHeader.A02;
            String str2 = shoppingTaggingFeedHeader.A01;
            if (str != null) {
                interfaceC56362iU.EaW(str2, str);
                return;
            } else {
                interfaceC56362iU.setTitle(str2);
                return;
            }
        }
        C14360o3.A0B(interfaceC56362iU, 0);
        Integer num = C05F.A00;
        C56455P4r c56455P4r = (C56455P4r) this.A02;
        interfaceC56362iU.Ehg(new C114795Gm(null, null, null, new ColorDrawable(c56455P4r.A0H), c56455P4r.A0J, new ViewOnClickListenerC55456OkA(c56455P4r, 0), num, -2, -2, -2, 2131953583, -2, -2, -2, true));
        interfaceC56362iU.EkS(true);
        EnumC53120NeX enumC53120NeX = c56455P4r.A0C;
        EnumC53120NeX enumC53120NeX2 = EnumC53120NeX.A02;
        int i = 2131966819;
        if (!AbstractC167007dF.A1X(enumC53120NeX, enumC53120NeX2)) {
            i = 2131966820;
        }
        c56455P4r.A07 = interfaceC56362iU.Eft(i, AbstractC53242c7.A0E((Context) this.A01));
        if (!AbstractC167007dF.A1X(c56455P4r.A0C, enumC53120NeX2) && c56455P4r.A0M.A01) {
            C3LO A0B2 = AbstractC31171DnF.A0B();
            A0B2.A0F = c56455P4r.A0K;
            A0B2.A05 = 2131966888;
            AbstractC31176DnK.A1B(new ViewOnClickListenerC55456OkA(c56455P4r, 1), A0B2, interfaceC56362iU);
        }
        if (AbstractC167007dF.A1X(c56455P4r.A0C, enumC53120NeX2) && c56455P4r.A0M.A01) {
            C3LO A0B3 = AbstractC31171DnF.A0B();
            A0B3.A0C = 2131966787;
            View A0F = AbstractC31177DnL.A0F(new ViewOnClickListenerC55456OkA(c56455P4r, 2), A0B3, interfaceC56362iU);
            if (A0F instanceof TextView) {
                textView = (TextView) A0F;
            } else {
                textView = null;
            }
            c56455P4r.A08 = textView;
        }
        c56455P4r.A04 = ((C56352iT) interfaceC56362iU).A0L;
        C56455P4r.A00(c56455P4r);
    }
}
