package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;

/* renamed from: X.8ZN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ZN {
    public final C23895Aho A00(Context context, ACRType aCRType, ClipsTemplateModel clipsTemplateModel, UserSession userSession, C8LJ c8lj, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass840 anonymousClass840, C8FR c8fr, C8MF c8mf, C199008r1 c199008r1, C8r2 c8r2, C9JS c9js, C84B c84b, EnumC76383bi enumC76383bi, AudioOverlayTrack audioOverlayTrack, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, java.util.Set set, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16820sZ interfaceC16820sZ9, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3, boolean z4) {
        MusicBrowseCategory musicBrowseCategory;
        C14360o3.A0B(str, 3);
        C14360o3.A0B(num, 5);
        C14360o3.A0B(set, 6);
        C14360o3.A0B(interfaceC16820sZ, 9);
        C14360o3.A0B(c8r2, 10);
        C14360o3.A0B(str2, 13);
        C14360o3.A0B(interfaceC16820sZ2, 17);
        C14360o3.A0B(interfaceC16820sZ3, 19);
        C14360o3.A0B(anonymousClass840, 20);
        C14360o3.A0B(interfaceC16820sZ4, 21);
        C14360o3.A0B(c8lj, 22);
        C14360o3.A0B(c8fr, 23);
        C14360o3.A0B(c8mf, 24);
        C14360o3.A0B(targetViewSizeProvider, 25);
        C14360o3.A0B(str4, 26);
        C14360o3.A0B(interfaceC16820sZ5, 27);
        C14360o3.A0B(interfaceC16660sJ, 28);
        C14360o3.A0B(interfaceC16820sZ6, 29);
        C14360o3.A0B(interfaceC16820sZ7, 30);
        C14360o3.A0B(interfaceC16820sZ8, 31);
        C14360o3.A0B(interfaceC16820sZ9, 32);
        C14360o3.A0B(list3, 42);
        C1816783z c1816783z = anonymousClass840.A02;
        C195868lW A04 = c1816783z.A01.A04();
        if (A04 != null) {
            C9C9 c9c9 = (C9C9) interfaceC16820sZ6.invoke();
            PendingMediaStore A00 = C25A.A00(userSession);
            List list4 = (List) interfaceC16820sZ5.invoke();
            if (list4 == null) {
                list4 = C16930sl.A00;
            }
            C22922A8s c22922A8s = new C22922A8s(context, userSession, str4, list4);
            List list5 = (List) interfaceC16820sZ5.invoke();
            if (list5 == null) {
                list5 = C16930sl.A00;
            }
            A7B a7b = new A7B(userSession, list5);
            String str8 = (String) interfaceC16820sZ4.invoke();
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            A79 a79 = new A79((C84A) userSession.A01(C84A.class, new C9F5(17, applicationContext, userSession)), str);
            A7A a7a = new A7A(userSession, context);
            C207169Ev c207169Ev = new C207169Ev(3, context, userSession);
            C9F5 c9f5 = new C9F5(18, context, A04);
            if (audioOverlayTrack != null) {
                musicBrowseCategory = audioOverlayTrack.A09;
            } else {
                musicBrowseCategory = null;
            }
            int AuP = c8mf.AuP();
            String str9 = c9c9.A00;
            String str10 = c9c9.A01;
            C22957AAb c22957AAb = new C22957AAb((EnumC33503Erc) interfaceC16820sZ9.invoke(), (C24H) interfaceC16820sZ8.invoke(), aCRType, userSession, targetViewSizeProvider, c1816783z, c8fr, c8r2, musicBrowseCategory, A04, num, str9, str10, set, AuP, z, z4);
            C207419Fu c207419Fu = new C207419Fu(str2, userSession, 1);
            return new C23895Aho(context, clipsTemplateModel, userSession, (CropInfo) interfaceC16820sZ7.invoke(), c8lj, anonymousClass840, c199008r1, c9js, AbstractC183338Bg.A00(userSession), c22922A8s, a79, a7a, c22957AAb, a7b, c84b, enumC76383bi, A00, bool, str8, str3, str5, str6, str7, list, list2, list3, interfaceC16820sZ, c9f5, new C9ES(userSession, 45), interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16660sJ, c207169Ev, c207419Fu, z2, z3);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
