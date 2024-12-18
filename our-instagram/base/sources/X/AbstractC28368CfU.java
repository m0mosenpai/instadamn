package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.CfU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28368CfU {
    public static final int[] A0B = new int[2];
    public final C28165CbC A00;
    public final Integer A01;
    public final Object A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final ViewGroup A08;
    public final AbstractC28368CfU A09;
    public final java.util.Set A0A;

    public AbstractC28368CfU(ViewGroup viewGroup, AbstractC28368CfU abstractC28368CfU, C28165CbC c28165CbC, Integer num, Object obj) {
        this.A00 = c28165CbC;
        this.A09 = abstractC28368CfU;
        this.A08 = viewGroup;
        this.A02 = obj;
        this.A01 = num;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C57243PbR(this, 14));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57243PbR(this, 12));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C57243PbR(this, 13));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C57243PbR(this, 15));
        String[] strArr = {"DecorView", "LinearLayout", "FrameLayout", "GenericDraweeView", AbstractC111324zv.A00(1725), "Row", "Column", "Image", "Text", "LithoView", "LithoRecyclerView", "WrapComponent", "DebugComponent", "FbLinearLayout", "FbMeasureBlockingFrameLayout", "FbSwipeRefreshLayout", "TouchInterceptorFrameLayout", "BetterRecyclerView"};
        C14360o3.A0B(strArr, 0);
        this.A0A = AbstractC009903n.A0K(strArr);
    }

    public static final AbstractC28368CfU A00(EnumC53235NgY enumC53235NgY, AbstractC28368CfU abstractC28368CfU) {
        if (enumC53235NgY == abstractC28368CfU.A06.getValue()) {
            return abstractC28368CfU;
        }
        AbstractC28368CfU A01 = abstractC28368CfU.A01();
        if (A01 != null) {
            return A00(enumC53235NgY, A01);
        }
        return null;
    }

    public final AbstractC28368CfU A01() {
        if (this instanceof Be7) {
            return ((Be7) this).A01;
        }
        return this.A09;
    }

    public final String A02() {
        String str;
        View view = (View) this.A02;
        String str2 = (String) view.getTag(R.id.view_tag_native_id);
        if (str2 == null) {
            try {
                str = AnonymousClass001.A0E(AbstractC25228BEl.A0M(view).getResourceEntryName(view.getId()), '(', ')');
            } catch (Exception unused) {
                str = "";
            }
            return AnonymousClass001.A0R(view.getClass().getSimpleName(), str);
        }
        return str2;
    }
}
