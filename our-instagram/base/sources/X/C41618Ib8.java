package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.Ib8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41618Ib8 {
    public static final Map A09 = AbstractC166987dD.A1I();
    public static final Map A0A = AbstractC166987dD.A1I();
    public C145116gW A00;
    public boolean A01;
    public boolean A02;
    public final C41023IEs A03;
    public final EnumC46183KcL A04;
    public final String A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final UserSession A08;

    public C41618Ib8(UserSession userSession, C41023IEs c41023IEs) {
        C14360o3.A0B(userSession, 2);
        this.A03 = c41023IEs;
        this.A08 = userSession;
        this.A04 = AbstractC47875LCv.A00(c41023IEs.A00.A04);
        String str = this.A03.A00.A02;
        this.A05 = str == null ? "" : str;
        this.A06 = AbstractC166987dD.A1E();
        this.A07 = AbstractC166987dD.A1E();
    }

    public final void A00(SuperlativeMentionSticker... superlativeMentionStickerArr) {
        C14360o3.A0B(superlativeMentionStickerArr, 0);
        ArrayList arrayList = this.A06;
        arrayList.clear();
        AnonymousClass016.A18(arrayList, superlativeMentionStickerArr);
        Map map = A09;
        EnumC46183KcL enumC46183KcL = this.A04;
        Object obj = map.get(enumC46183KcL);
        if (obj == null) {
            obj = AbstractC166987dD.A1E();
            map.put(enumC46183KcL, obj);
        }
        AnonymousClass016.A18((Collection) obj, superlativeMentionStickerArr);
    }
}
