package X;

import android.content.Context;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.ReelHeaderAttributionType;
import java.util.List;

/* renamed from: X.6a8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141296a8 extends C6ZL {
    public final Context A00;
    public final EnumC193878i8 A01;
    public final ReelHeaderAttributionType A02;
    public final C41181vS A03;
    public final C6eI A04;
    public final InterfaceC144596ff A05;

    public C141296a8(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        CameraTool cameraTool;
        CreativeConfigIntf Asm;
        List B9a;
        GenAIToolInfoDictIntf genAIToolInfoDictIntf;
        this.A00 = context;
        this.A04 = c6eI;
        this.A05 = interfaceC144596ff;
        this.A03 = c41181vS;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (Asm = c38321qM.A0C.Asm()) != null && (B9a = Asm.B9a()) != null && (genAIToolInfoDictIntf = (GenAIToolInfoDictIntf) AbstractC001800i.A0J(B9a)) != null) {
            cameraTool = genAIToolInfoDictIntf.C9G();
        } else {
            cameraTool = null;
        }
        this.A01 = AbstractC141306a9.A00(cameraTool);
        this.A02 = ReelHeaderAttributionType.A0U;
    }
}
