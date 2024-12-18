package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;

/* renamed from: X.MAl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50112MAl extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50112MAl(Object obj, Object obj2, Object obj3, Object obj4, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        switch (this.A00) {
            case 0:
                obj5 = this.A02;
                obj4 = this.A03;
                str = this.A05;
                obj2 = this.A04;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                obj4 = this.A03;
                str = this.A05;
                obj3 = this.A01;
                obj5 = this.A02;
                i = 1;
                break;
            case 2:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 3;
                break;
            default:
                str = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj2 = this.A04;
                obj5 = this.A02;
                i = 4;
                break;
        }
        return new C50112MAl(obj2, obj4, obj3, obj5, str, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Bitmap bitmap;
        switch (this.A00) {
            case 0:
                AbstractC09560e7.A00(obj);
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(this.A05);
                A0s.A02(AbstractC31180DnO.A0k(this.A04));
                C6FP.A03((C6FG) this.A01, c102884kP, A0s.A00(), interfaceC103384lE);
                break;
            case 1:
                AbstractC09560e7.A00(obj);
                C44493Jlz c44493Jlz = (C44493Jlz) this.A04;
                Context context = (Context) this.A03;
                String str3 = this.A05;
                Bitmap bitmap2 = (Bitmap) this.A01;
                C14360o3.A0A(bitmap2);
                File A04 = AbstractC13530mf.A04(context);
                C14360o3.A07(A04);
                if (A04.exists()) {
                    C1NC.A0M(bitmap2, A04);
                    c44493Jlz.A00.put(str3, A04);
                    str = A04.getCanonicalPath();
                } else {
                    str = null;
                }
                if (str != null) {
                    AbstractC25225BEi.A1U(this.A02, str);
                    break;
                }
                break;
            case 2:
                AbstractC09560e7.A00(obj);
                C33092Eiu c33092Eiu = (C33092Eiu) this.A04;
                UserSession userSession = c33092Eiu.A00;
                String str4 = this.A05;
                Collection collection = (Collection) this.A01;
                AbstractC167017dG.A1P(str4, collection);
                C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                A0c.A0L("direct_v2/threads/%s/detect_thread_languages/", str4);
                A0c.A9s("sender_bulk_messages", AbstractC31175DnJ.A0b(collection));
                A0c.A0P(null, HAL.class, IQE.class, false);
                JX4.A04(new PZ3(this.A03, this.A02, c33092Eiu, null, 22), A0c.A0N().A03(1790817603));
                break;
            case 3:
                AbstractC09560e7.A00(obj);
                UserSession userSession2 = ((C49596Lvp) this.A04).A00;
                C48508Lcz c48508Lcz = (C48508Lcz) userSession2.A01(C48508Lcz.class, new J8V(userSession2, 26));
                String str5 = this.A05;
                String obj2 = this.A01.toString();
                String obj3 = this.A03.toString();
                String obj4 = this.A02.toString();
                AbstractC167027dH.A13(obj2, obj3, obj4);
                if (str5 != null) {
                    String A0j = AnonymousClass001.A0j(obj2, obj3, obj4, '_', '_');
                    InterfaceC19630xq interfaceC19630xq = c48508Lcz.A00;
                    C16910sj c16910sj = C16910sj.A00;
                    java.util.Set stringSet = interfaceC19630xq.getStringSet(A0j, c16910sj);
                    if (stringSet == null) {
                        stringSet = c16910sj;
                    }
                    java.util.Set A0j2 = AbstractC001800i.A0j(stringSet);
                    A0j2.add(str5);
                    AbstractC43594JPz.A1M(interfaceC19630xq, A0j, A0j2);
                    break;
                }
                break;
            default:
                AbstractC09560e7.A00(obj);
                C09530e4 A1L = AbstractC166987dD.A1L(EnumC46182KcK.A02, this.A05);
                EnumC46182KcK enumC46182KcK = EnumC46182KcK.A04;
                C56803PIu c56803PIu = (C56803PIu) this.A01;
                User user = c56803PIu.A08;
                if (user != null) {
                    str2 = user.B8y();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25229BEm.A1b(enumC46182KcK, str2, A1L));
                try {
                    User user2 = c56803PIu.A08;
                    if (user2 != null) {
                        C73033Pe A0K = C25821No.A00().A0K(((AbstractC51025MgY) ((AbstractC52865NaM) this.A04)).A04, user2.Bhu(), null);
                        if (A0K != null && (bitmap = A0K.A01) != null) {
                            C0fK.A03(bitmap);
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 45, 45, false);
                            C14360o3.A07(createScaledBitmap);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            C0fK.A02(Bitmap.CompressFormat.JPEG, createScaledBitmap, byteArrayOutputStream, 50);
                            try {
                                A07.put(EnumC46182KcK.A06, byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.close();
                            } finally {
                            }
                        }
                    }
                } catch (Exception e) {
                    C0K8.A0F("sup: IgLiveCommentsViewModel", AbstractC166997dE.A0y("sup: IgLiveCommentsViewModel Unable to fetch profile pic bitmap ", e), e);
                }
                ((LIV) this.A03).A01(AbstractC46576KjF.A00(new C30184DRp(36, A07, c56803PIu, this.A02)));
                break;
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50112MAl) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
