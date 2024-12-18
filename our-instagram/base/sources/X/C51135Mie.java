package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import java.util.List;

/* renamed from: X.Mie, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51135Mie extends C2UU {
    public List A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final C52151N6b A03;

    public C51135Mie(Context context, InterfaceC11380iw interfaceC11380iw, C52151N6b c52151N6b, List list) {
        C14360o3.A0B(list, 2);
        this.A01 = context;
        this.A00 = list;
        this.A02 = interfaceC11380iw;
        this.A03 = c52151N6b;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51292MlF(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.layout_clips_sfx_effect_item, false), this);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51292MlF c51292MlF = (C51292MlF) c3oo;
        C14360o3.A0B(c51292MlF, 0);
        C51757Mtg c51757Mtg = (C51757Mtg) this.A00.get(i);
        C14360o3.A0B(c51757Mtg, 0);
        c51292MlF.A00.setText(c51757Mtg.A02);
        CircularProgressImageView circularProgressImageView = c51292MlF.A01;
        circularProgressImageView.setAngle(0.0f);
        ImageUrl imageUrl = (ImageUrl) c51757Mtg.A01;
        C51135Mie c51135Mie = c51292MlF.A02;
        circularProgressImageView.setUrl(imageUrl, c51135Mie.A02);
        circularProgressImageView.A01 = ViewOnClickListenerC55459OkE.A00(c51757Mtg, c51292MlF, c51135Mie, 13);
        circularProgressImageView.setOnLongClickListener(new ViewOnLongClickListenerC55478OkX(1, c51757Mtg, c51135Mie));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-685371959);
        int size = this.A00.size();
        C0f9.A0A(-1445443658, A03);
        return size;
    }
}
