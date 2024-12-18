package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218259kx extends C8J9 implements C8FJ {
    public static boolean A03;
    public final ViewGroup A00;
    public final A62 A01;
    public final C218209ks A02;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // X.C8FJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DDC(X.InterfaceC120325cX r11, java.lang.String r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218259kx.DDC(X.5cX, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8JE, X.9ks] */
    public C218259kx(final Context context, ViewGroup viewGroup, final InterfaceC11380iw interfaceC11380iw, C8C0 c8c0, A62 a62) {
        super(c8c0);
        this.A00 = viewGroup;
        this.A01 = a62;
        ?? r0 = new C8JE(context, interfaceC11380iw, this, this) { // from class: X.9ks
            public final InterfaceC11380iw A00;

            {
                this.A00 = interfaceC11380iw;
            }

            @Override // X.C2UU
            public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
                C9V2 c9v2 = (C9V2) c3oo;
                C14360o3.A0B(c9v2, 0);
                IgImageView igImageView = c9v2.A0A;
                igImageView.A09();
                InterfaceC120325cX A01 = A01(i);
                if (A01 != null) {
                    Context context2 = ((C8JF) this).A01;
                    EnumC138556Pl enumC138556Pl = ((C23572AcQ) A01).A00;
                    Drawable drawable = context2.getDrawable(enumC138556Pl.A01);
                    if (drawable != null) {
                        drawable.setTint(AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_pink));
                        igImageView.setImageDrawable(drawable);
                        A07(c9v2, i);
                        if (enumC138556Pl == EnumC138556Pl.A0D) {
                            igImageView.setPadding(24, 24, 24, 24);
                        } else {
                            igImageView.setPadding(0, 0, 0, 0);
                        }
                        if (i != ((C8JF) this).A00) {
                            igImageView.setColorFilter(-1);
                        } else {
                            igImageView.clearColorFilter();
                        }
                        int i2 = enumC138556Pl.A00;
                        if (i2 != -1) {
                            View view = c9v2.itemView;
                            AbstractC166997dE.A18(view.getContext(), view, i2);
                            return;
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        };
        this.A02 = r0;
        super.A00 = r0;
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
        throw C00O.createAndThrow();
    }
}
