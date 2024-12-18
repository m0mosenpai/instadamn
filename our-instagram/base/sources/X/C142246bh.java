package X;

import android.content.Context;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;

/* renamed from: X.6bh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142246bh {
    public final Context A00;
    public final EffectCollectionService A01;
    public final C142596cL A02;
    public final C19L A03;

    public C142246bh(Context context, EffectCollectionService effectCollectionService, C142596cL c142596cL, C19L c19l) {
        C14360o3.A0B(effectCollectionService, 2);
        this.A00 = context;
        this.A01 = effectCollectionService;
        this.A02 = c142596cL;
        this.A03 = c19l;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.8B8, java.lang.Object] */
    public final Object A00(EnumC223429tZ enumC223429tZ, C22P c22p, UserSession userSession, InterfaceC38391qT interfaceC38391qT, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        String BqK = interfaceC38391qT.BqK();
        EnumC77213d7 enumC77213d7 = EnumC77213d7.A04;
        ?? obj = new Object();
        obj.A01 = BqK;
        obj.A00 = enumC77213d7;
        return AbstractC23641Du.A00(interfaceC23621Ds, this.A03.Arv(), new MBn(enumC223429tZ, c22p, this, userSession, obj, interfaceC38391qT, str, str3, str2, null));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.8B8, java.lang.Object] */
    public final Object A01(EnumC223429tZ enumC223429tZ, C22P c22p, UserSession userSession, InterfaceC38391qT interfaceC38391qT, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        String BqK = interfaceC38391qT.BqK();
        EnumC77213d7 enumC77213d7 = EnumC77213d7.A03;
        ?? obj = new Object();
        obj.A01 = BqK;
        obj.A00 = enumC77213d7;
        return AbstractC23641Du.A00(interfaceC23621Ds, this.A03.Arv(), new MBn(enumC223429tZ, c22p, this, userSession, obj, interfaceC38391qT, str, str2, null, null));
    }
}
