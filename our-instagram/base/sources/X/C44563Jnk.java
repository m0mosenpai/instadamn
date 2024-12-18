package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.List;

/* renamed from: X.Jnk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44563Jnk extends C2UU {
    public List A00;
    public final Context A01;
    public final EnumC50631MWs A02;
    public final UserSession A03;
    public final MQB A04;

    public C44563Jnk(Context context, EnumC50631MWs enumC50631MWs, UserSession userSession, MQB mqb) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = enumC50631MWs;
        this.A04 = mqb;
        this.A00 = C16930sl.A00;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44704Jqn c44704Jqn = (C44704Jqn) c3oo;
        C14360o3.A0B(c44704Jqn, 0);
        PromptStickerModel promptStickerModel = (PromptStickerModel) this.A00.get(i);
        IgSimpleImageView igSimpleImageView = c44704Jqn.A00;
        Context context = this.A01;
        igSimpleImageView.setImageDrawable(new C221009pO(context, this.A03, promptStickerModel, "trending_prompts_page"));
        c44704Jqn.A01.setImageDrawable(new C180537zh(context, promptStickerModel.A00(), R.dimen.account_discovery_bottom_gap, true, false, true));
        c44704Jqn.A02.setImageDrawable(new C180537zh(context, promptStickerModel.A00(), R.dimen.account_discovery_bottom_gap, true, false, true));
        LQ1.A00(igSimpleImageView, 69, this, promptStickerModel);
        AbstractC37302Gc3.A0o(context, igSimpleImageView, promptStickerModel.A00.getText(), 2131975738);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-813504658);
        int size = this.A00.size();
        C0f9.A0A(71692156, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C44704Jqn(AbstractC25226BEj.A0R(LayoutInflater.from(this.A01), viewGroup, R.layout.trending_prompt_item, AbstractC43592JPx.A1Y(viewGroup)));
    }
}
