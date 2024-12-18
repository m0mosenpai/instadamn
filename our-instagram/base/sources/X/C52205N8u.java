package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.N8u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52205N8u extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C52205N8u(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -714765441);
        C14360o3.A0B(obj, 2);
        Context context = this.A00;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.mentionconversion.MentionConversionViewBinder.Holder");
        OA6 oa6 = (OA6) tag;
        C54673OCz c54673OCz = (C54673OCz) obj;
        AbstractC167007dF.A1K(context, oa6);
        C14360o3.A0B(c54673OCz, 2);
        oa6.A02.setText(c54673OCz.A04);
        IgTextView igTextView = oa6.A01;
        igTextView.setVisibility(8);
        String str = c54673OCz.A03;
        if (str != null) {
            igTextView.setText(str);
            igTextView.setVisibility(0);
        }
        AbstractC166997dE.A19(context, oa6.A00, c54673OCz.A00);
        C0f9.A0A(926311670, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC25225BEi.A1R(obj2);
        AbstractC31176DnK.A1T(anonymousClass306);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1929535425);
        View A07 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.mention_conversion_row, false);
        A07.setTag(new OA6(A07));
        C0f9.A0A(-878231717, A03);
        return A07;
    }
}
