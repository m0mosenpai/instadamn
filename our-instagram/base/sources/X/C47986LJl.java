package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.LJl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47986LJl {
    public static final C47986LJl A00 = new Object();

    public static final boolean A01(C44834JtA c44834JtA, Integer num, Integer num2) {
        List singletonList;
        EnumC46266Kdy enumC46266Kdy;
        boolean z = true;
        if (num2 == null || num2.intValue() != 1) {
            if (num2 != null && num2.intValue() > 1) {
                singletonList = Collections.singletonList(true);
            } else {
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        z = false;
                    } else if (intValue > 1) {
                        singletonList = Collections.singletonList(false);
                    }
                }
                return false;
            }
            C14360o3.A07(singletonList);
            c44834JtA.A07("is_animated", singletonList);
            enumC46266Kdy = EnumC46266Kdy.STACK;
            c44834JtA.A01(enumC46266Kdy, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            return true;
        }
        c44834JtA.A07("is_animated", AbstractC166987dD.A1J(z));
        enumC46266Kdy = EnumC46266Kdy.SINGLE_IMAGE;
        c44834JtA.A01(enumC46266Kdy, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        return true;
    }

    public static final EnumC72433Xdd A00(AbstractC12990ll abstractC12990ll, DirectThreadKey directThreadKey) {
        List list;
        if (directThreadKey != null && (list = directThreadKey.A02) != null) {
            if (list.size() > 1) {
                return EnumC72433Xdd.A05;
            }
            if (list.size() == 1) {
                if (C14360o3.A0K(AbstractC001800i.A0N(list), C18U.A04(C06090Tz.A06, abstractC12990ll, 36887717464376084L))) {
                    return EnumC72433Xdd.A02;
                }
                return EnumC72433Xdd.A06;
            }
        }
        return EnumC72433Xdd.A07;
    }

    public final void A02(UserSession userSession, DirectThreadKey directThreadKey, Boolean bool, int i, boolean z) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ai_image_interaction");
        if (A0f.isSampled()) {
            int i2 = !z ? 1 : 0;
            if (i2 != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0f, "screen_type", i2);
            } else {
                A0f.AAP("screen_type", null);
            }
            AbstractC166997dE.A1N(A0f, "view_name", 24);
            String str = null;
            A0f.AAP("selected_item", null);
            AbstractC166997dE.A1N(A0f, "action_type", i);
            A0f.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_blurred", bool);
            A0f.AAQ(c0Zx, "ai_image");
            A0f.A8R(A00(userSession, directThreadKey), "thread_type");
            AbstractC31175DnJ.A1A(A0f, false);
            if (directThreadKey != null) {
                str = directThreadKey.A01;
            }
            AbstractC31171DnF.A1F(A0f, str);
            A0f.Cht();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Zx, X.JtA] */
    public final void A03(UserSession userSession, C3o9 c3o9, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, int i2, int i3) {
        Long l;
        EnumC72433Xdd enumC72433Xdd;
        String A01;
        if (C14360o3.A0K(str2, C18U.A04(C06090Tz.A06, userSession, 36887717464376084L))) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ai_image_interaction");
            if (A0f.isSampled()) {
                ?? c0Zx = new C0Zx();
                if (num3 != null) {
                    l = AbstractC25229BEm.A0n(num3);
                } else {
                    l = null;
                }
                c0Zx.A05("stack_index", l);
                if (A01(c0Zx, num, num2)) {
                    AbstractC166997dE.A1N(A0f, "screen_type", 999);
                    AbstractC166997dE.A1N(A0f, "view_name", i);
                    A0f.AAP("selected_item", str3);
                    AbstractC166997dE.A1N(A0f, "action_type", i2);
                    A0f.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0f.AAQ(c0Zx, "ai_image");
                    if (i3 != 47) {
                        if (i3 != 1003) {
                            if (i3 != 1012) {
                                enumC72433Xdd = EnumC72433Xdd.A07;
                            } else {
                                enumC72433Xdd = EnumC72433Xdd.A02;
                            }
                        } else {
                            enumC72433Xdd = EnumC72433Xdd.A06;
                        }
                    } else {
                        enumC72433Xdd = EnumC72433Xdd.A05;
                    }
                    A0f.A8R(enumC72433Xdd, "thread_type");
                    A0f.A7v("is_e2ee", bool);
                    if (c3o9 != null && (A01 = AbstractC43827JZq.A01(c3o9)) != null) {
                        str = A01;
                    }
                    AbstractC31171DnF.A1F(A0f, str);
                    A0f.Cht();
                }
            }
        }
    }
}
