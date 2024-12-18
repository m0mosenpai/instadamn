package X;

import android.view.View;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.chat.model.ChatStickerChannelType;
import java.util.List;

/* renamed from: X.8F9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8F9 implements C5NL {
    public View A00;
    public IGAIAgentType A01;
    public URK A02;
    public ImageUrl A03;
    public C2EY A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C66645URj A0E;

    public C8F9(View view, IGAIAgentType iGAIAgentType, URK urk, ImageUrl imageUrl, C2EY c2ey, C66645URj c66645URj, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        this.A0E = c66645URj;
        this.A07 = str;
        this.A06 = str2;
        this.A03 = imageUrl;
        this.A00 = view;
        this.A0B = z;
        this.A0D = z2;
        this.A0C = z3;
        this.A02 = urk;
        this.A01 = iGAIAgentType;
        this.A04 = c2ey;
        this.A05 = str3;
        this.A0A = z4;
        this.A08 = str4;
        this.A09 = str5;
    }

    public final int A00() {
        Integer num;
        C66645URj c66645URj = this.A0E;
        if (c66645URj != null && (num = c66645URj.A09) != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean A01() {
        ChatStickerChannelType chatStickerChannelType;
        C66645URj c66645URj = this.A0E;
        if (c66645URj == null || (chatStickerChannelType = c66645URj.A03) == null) {
            chatStickerChannelType = ChatStickerChannelType.A05;
        }
        if (chatStickerChannelType != ChatStickerChannelType.A04) {
            return false;
        }
        return true;
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG c5ng = new C5NG();
        c5ng.A01 = C5NH.A06;
        return c5ng;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        return C05F.A0o;
    }

    public C8F9() {
        this(null, null, null, null, null, null, "", "", null, null, null, false, false, false, false);
    }
}
