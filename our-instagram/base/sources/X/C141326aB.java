package X;

import android.content.Context;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141326aB extends C6ZL {
    public final Context A00;
    public final ReelHeaderAttributionType A01;
    public final C41181vS A02;
    public final C6eI A03;
    public final InterfaceC144596ff A04;
    public final Integer A05;

    public C141326aB(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        Integer num;
        CreativeConfigIntf Asm;
        List B9a;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf;
        CameraTool C9G;
        this.A00 = context;
        this.A03 = c6eI;
        this.A04 = interfaceC144596ff;
        this.A02 = c41181vS;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (Asm = c38321qM.A0C.Asm()) != null && (B9a = Asm.B9a()) != null && (genAIToolInfoDictIntf = (GenAIToolInfoDictIntf) AbstractC001800i.A0J(B9a)) != null && (C9G = genAIToolInfoDictIntf.C9G()) != null) {
            switch (C9G.ordinal()) {
                case 6:
                    num = C05F.A0C;
                    break;
                case 74:
                case 79:
                    num = C05F.A01;
                    break;
                case 77:
                case 78:
                    num = C05F.A00;
                    break;
                case 103:
                    num = C05F.A0N;
                    break;
            }
            this.A05 = num;
            this.A01 = ReelHeaderAttributionType.A0X;
        }
        num = null;
        this.A05 = num;
        this.A01 = ReelHeaderAttributionType.A0X;
    }
}
