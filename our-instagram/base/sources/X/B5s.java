package X;

import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final /* synthetic */ class B5s extends C03E implements InterfaceC16660sJ {
    public B5s(Object obj) {
        super(1, obj, C190588cG.class, "onMentionSuggestionTapped", "onMentionSuggestionTapped(Lcom/instagram/creation/capture/quickcapture/mention/MentionTaggingViewBinder$ViewHolder;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C218529lO c218529lO = (C218529lO) obj;
        C14360o3.A0B(c218529lO, 0);
        C190588cG c190588cG = (C190588cG) this.receiver;
        if (((AbstractC190598cH) c190588cG).A03.size() < 20) {
            InterfaceC190578cF interfaceC190578cF = c190588cG.A00;
            User user = c218529lO.A02;
            if (user != null) {
                interfaceC190578cF.DSl(user, c218529lO.getBindingAdapterPosition());
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            AbstractC22754A1y.A00(AbstractC166997dE.A0L(c218529lO.itemView), 20);
        }
        return C0eB.A00;
    }
}
