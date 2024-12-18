package X;

import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Map;

/* renamed from: X.6do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143496do extends AbstractC142046bN {
    public final CreativeConfigIntf A00;
    public final PromptStickerModel A01;
    public final C8FC A02;
    public final Map A03;

    public C143496do(CreativeConfigIntf creativeConfigIntf, PromptStickerModel promptStickerModel, C8FC c8fc, Map map) {
        C14360o3.A0B(promptStickerModel, 1);
        C14360o3.A0B(c8fc, 2);
        this.A01 = promptStickerModel;
        this.A02 = c8fc;
        this.A00 = creativeConfigIntf;
        this.A03 = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143496do) {
                C143496do c143496do = (C143496do) obj;
                if (!C14360o3.A0K(this.A01, c143496do.A01) || !C14360o3.A0K(this.A02, c143496do.A02) || !C14360o3.A0K(this.A00, c143496do.A00) || !C14360o3.A0K(this.A03, c143496do.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        CreativeConfigIntf creativeConfigIntf = this.A00;
        int hashCode2 = (hashCode + (creativeConfigIntf == null ? 0 : creativeConfigIntf.hashCode())) * 31;
        Map map = this.A03;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }
}
