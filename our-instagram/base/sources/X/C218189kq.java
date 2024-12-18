package X;

import android.content.Context;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218189kq extends C8JE {
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C9V2 c9v2 = (C9V2) c3oo;
        C14360o3.A0B(c9v2, 0);
        IgImageView igImageView = c9v2.A0A;
        igImageView.A09();
        InterfaceC120325cX A01 = A01(i);
        if (A01 != null) {
            Context context = ((C8JF) this).A01;
            VES ves = ((C23571AcP) A01).A00;
            AbstractC166997dE.A19(context, igImageView, ves.A01);
            AbstractC166997dE.A18(context, igImageView, ves.A00);
            AbstractC56952jT.A01(igImageView);
            A07(c9v2, i);
            int i2 = -65536;
            if (i != ((C8JF) this).A00) {
                i2 = -1;
            }
            igImageView.setColorFilter(i2);
            return;
        }
        throw AbstractC166987dD.A14("Sticker style should not be null.");
    }
}
