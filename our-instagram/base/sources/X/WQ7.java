package X;

import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;

/* loaded from: classes11.dex */
public final class WQ7 implements C1N8 {
    public static final WQ7 A00 = new WQ7();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        C2JS A04 = ((C2JS) obj).A04(C59052QVk.class, "back_button", -1300571440);
        if (A04 == null || (str = A04.A07("text")) == null) {
            str = "";
        }
        return new InlineBackButtonItem(VG3.A0L, str);
    }
}
