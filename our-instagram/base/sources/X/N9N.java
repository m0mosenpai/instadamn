package X;

import com.instagram.api.schemas.StoryPromptType;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N9N extends C1P1 {
    public final /* synthetic */ G4W A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public N9N(G4W g4w, String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = g4w;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1643192710);
        XZC xzc = (XZC) obj;
        int A032 = C0f9.A03(823415222);
        C14360o3.A0B(xzc, 0);
        C51804Mv8 c51804Mv8 = xzc.A05;
        if (c51804Mv8 == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        String str = this.A02;
        String str2 = this.A01;
        String str3 = this.A03;
        List list = c51804Mv8.A07;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((C51802Mv6) ((InterfaceC58246Prq) it.next())).A00);
        }
        int size = list.size();
        PromptStickerModel promptStickerModel = new PromptStickerModel(null, StoryPromptType.A05, null, C05F.A00, str, str2, str3, null, null, A0q, size, 0, false, false, false);
        G4W g4w = this.A00;
        LHI.A00(g4w.A03, C22P.A0D, g4w.A05, promptStickerModel);
        C0f9.A0A(1812140650, A032);
        C0f9.A0A(306182171, A03);
    }
}
