package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CG3 {
    public static final C82713mZ A00(AbstractC166097bd abstractC166097bd, C166047bW c166047bW, C18920wW c18920wW, InterfaceC60442pS interfaceC60442pS, List list) {
        C167297di c167297di;
        C51760Mtj c51760Mtj;
        String str;
        String str2;
        String str3;
        Long l;
        String str4;
        Long l2;
        Object obj;
        Object obj2;
        Object obj3;
        C14360o3.A0B(abstractC166097bd, 0);
        AbstractC167017dG.A1Q(list, c18920wW);
        EnumC123285i3 enumC123285i3 = null;
        if (interfaceC60442pS != null && c166047bW != null && (abstractC166097bd instanceof C167297di) && (c167297di = (C167297di) abstractC166097bd) != null) {
            boolean z = true;
            if (c167297di.A0H == C05F.A00) {
                Iterator it = list.iterator();
                int i = 0;
                int i2 = 0;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i + 1;
                        if (i < 0) {
                            AbstractC16960so.A1U();
                            throw C00O.createAndThrow();
                        }
                        AbstractC166097bd abstractC166097bd2 = (AbstractC166097bd) next;
                        if (abstractC166097bd2 instanceof C167297di) {
                            String str5 = ((C167297di) abstractC166097bd2).A0K;
                            if (C14360o3.A0K(str5, c167297di.A0N)) {
                                int A05 = AbstractC25226BEj.A05(list);
                                if (i3 <= A05) {
                                    int i4 = 0;
                                    for (int i5 = i3; !C14360o3.A0K(((AbstractC166097bd) list.get(i5)).A00, ((AbstractC166097bd) c167297di).A00); i5++) {
                                        i4++;
                                        if (i5 != A05) {
                                        }
                                    }
                                    Integer valueOf = Integer.valueOf(i2);
                                    c51760Mtj = new C51760Mtj(valueOf, valueOf, Integer.valueOf(i4), 12);
                                    break loop0;
                                }
                                i2++;
                            } else {
                                if (C14360o3.A0K(str5, c167297di.A0K)) {
                                    Integer valueOf2 = Integer.valueOf(i2);
                                    c51760Mtj = new C51760Mtj(valueOf2, valueOf2, (Integer) null, 12);
                                    break;
                                }
                                i2++;
                            }
                        }
                        i = i3;
                    } else {
                        c51760Mtj = null;
                        break;
                    }
                }
                C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AbstractC111324zv.A00(4149));
                c82713mZ.A4u = c167297di.A0K;
                c82713mZ.A61 = c166047bW.A0I;
                c82713mZ.A3i = Long.valueOf(AbstractC167017dG.A0K(c167297di.A0G));
                c82713mZ.A1f = Boolean.valueOf(interfaceC60442pS.isOrganicEligible());
                if (c167297di.A05 != EnumC168507fk.A02) {
                    z = false;
                }
                c82713mZ.A1H = Boolean.valueOf(z);
                c82713mZ.A67 = c166047bW.A0J;
                c82713mZ.A4w = c167297di.A0C.getId();
                c82713mZ.A4c = AbstractC25228BEl.A18(c166047bW.A0A);
                c82713mZ.A6Q = c167297di.A0N;
                if (c51760Mtj != null && (obj3 = c51760Mtj.A01) != null) {
                    str = obj3.toString();
                } else {
                    str = null;
                }
                c82713mZ.A4v = str;
                if (c51760Mtj != null && (obj2 = c51760Mtj.A02) != null) {
                    str2 = obj2.toString();
                } else {
                    str2 = null;
                }
                c82713mZ.A6R = str2;
                if (c51760Mtj != null && (obj = c51760Mtj.A00) != null) {
                    str3 = obj.toString();
                } else {
                    str3 = null;
                }
                c82713mZ.A4n = str3;
                c82713mZ.A1s = Boolean.valueOf(c167297di.A0c);
                c82713mZ.A0N(c166047bW.A05);
                c82713mZ.A6g = c166047bW.A0L;
                c82713mZ.A1n = false;
                c82713mZ.A1u = Boolean.valueOf(c167297di.A0d);
                C168497fj c168497fj = c167297di.A07;
                if (c168497fj.A05) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(450));
                    User user = c168497fj.A02;
                    if (user != null) {
                        l = AbstractC25231BEo.A0k(user);
                    } else {
                        l = null;
                    }
                    A0f.A9K("entity_id", l);
                    if (user != null) {
                        str4 = user.getUsername();
                    } else {
                        str4 = null;
                    }
                    A0f.AAP("entity_name", str4);
                    String str6 = c168497fj.A04;
                    A0f.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str6);
                    A0f.AAP("m_pk", str6);
                    String str7 = c168497fj.A03;
                    if (str7 != null) {
                        l2 = AbstractC166997dE.A0j(str7);
                    } else {
                        l2 = null;
                    }
                    A0f.A9K("media_id", l2);
                    EnumC40111tc enumC40111tc = c168497fj.A01;
                    if (enumC40111tc != null) {
                        enumC123285i3 = enumC40111tc.A00();
                    }
                    A0f.A8R(enumC123285i3, "media_type");
                    A0f.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                    AbstractC25234BEr.A11(A0f, AbstractC111324zv.A00(205), AbstractC82663mU.A00);
                    A0f.Cht();
                }
                String A14 = AbstractC25225BEi.A14();
                if (A14 != null) {
                    c82713mZ.A6C = A14;
                }
                return c82713mZ;
            }
        }
        return null;
    }
}
