package X;

import android.content.Context;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218199kr extends C8JE {
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C9V2 c9v2 = (C9V2) c3oo;
        C14360o3.A0B(c9v2, 0);
        IgImageView igImageView = c9v2.A0A;
        InterfaceC120325cX A01 = A01(i);
        if (A01 != null) {
            EnumC172837mv enumC172837mv = (EnumC172837mv) A01;
            Context context = ((C8JF) this).A01;
            AbstractC166997dE.A19(context, igImageView, enumC172837mv.A02);
            AbstractC166997dE.A18(context, igImageView, enumC172837mv.A01);
            A07(c9v2, i);
            if (i != ((C8JF) this).A00) {
                igImageView.setColorFilter(-1);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
