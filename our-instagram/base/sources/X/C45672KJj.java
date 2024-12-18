package X;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.KJj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45672KJj extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44714Jqx(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.thread_message_typing_indicator, false), this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        FrameLayout.LayoutParams layoutParams;
        C45183JzP c45183JzP = (C45183JzP) interfaceC66482zP;
        C44714Jqx c44714Jqx = (C44714Jqx) c3oo;
        AbstractC167017dG.A1N(c45183JzP, c44714Jqx);
        View view = c44714Jqx.A00;
        view.findViewById(R.id.sender_avatar).setVisibility(8);
        C7IM c7im = c45183JzP.A00;
        LayerDrawable A02 = AbstractC162737Qk.A02(c7im);
        ImageView imageView = c44714Jqx.A01;
        Context A0L = AbstractC166997dE.A0L(view);
        AbstractC162737Qk.A05(A0L, A02, c7im, false);
        imageView.setBackground(A02);
        JUV juv = c44714Jqx.A02;
        AbstractC85953sP.A02(A0L, juv, R.attr.igds_color_secondary_text);
        imageView.setImageDrawable(juv);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = 8388613;
        }
        juv.start();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45183JzP.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44714Jqx c44714Jqx = (C44714Jqx) c3oo;
        C14360o3.A0B(c44714Jqx, 0);
        c44714Jqx.A02.stop();
    }
}
