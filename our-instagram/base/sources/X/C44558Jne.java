package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.List;

/* renamed from: X.Jne, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44558Jne extends C2UU {
    public final List A00;
    public final InterfaceC11380iw A01;
    public final InterfaceC16620sF A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        float f;
        C14360o3.A0B(c3oo, 0);
        C44683JqS c44683JqS = (C44683JqS) c3oo;
        C44135Jf0 c44135Jf0 = (C44135Jf0) this.A00.get(i);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        InterfaceC16620sF interfaceC16620sF = this.A02;
        AbstractC167007dF.A1D(c44683JqS, 0, c44135Jf0);
        c44683JqS.A01.setText(c44135Jf0.A07);
        View view = c44683JqS.A00;
        boolean z = c44135Jf0.A02;
        if (z && (c44135Jf0.A05 == null || C14360o3.A0K(c44135Jf0.A04, false) || C14360o3.A0K(c44135Jf0.A00, false))) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
        CircularImageView circularImageView = c44683JqS.A02;
        String str = c44135Jf0.A05;
        if (z && str == null) {
            str = c44135Jf0.A06;
        }
        AbstractC25235BEs.A1I(interfaceC11380iw, circularImageView, str);
        C0fQ.A00(new ViewOnClickListenerC48067LPs(i, 0, c44135Jf0, interfaceC16620sF), view);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(AbstractC166997dE.A0L(viewGroup)), viewGroup, R.layout.layout_avatars_mentionable_friend_item, false);
        A0D.setTag(new C44683JqS(A0D));
        Object tag = A0D.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.avatars.mentions.adapter.AvatarMentionableFriendItemViewBinder.Holder");
        return (C3OO) tag;
    }

    public C44558Jne(InterfaceC11380iw interfaceC11380iw, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167017dG.A1P(interfaceC11380iw, interfaceC16620sF);
        this.A01 = interfaceC11380iw;
        this.A02 = interfaceC16620sF;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1464489352);
        int size = this.A00.size();
        C0f9.A0A(1351194364, A03);
        return size;
    }
}
