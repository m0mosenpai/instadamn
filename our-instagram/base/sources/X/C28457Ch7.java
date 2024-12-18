package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Iterator;

/* renamed from: X.Ch7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28457Ch7 {
    public final EnumC39637HiS A00;
    public final C18920wW A01;
    public final C3o9 A02;
    public final String A03;
    public final String A04;

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "direct_custom_theme_next_click");
        if (A0f.isSampled()) {
            A03(A0f, this, str);
            A01(C8e.AI_THEME_LOADING, A0f, this, "minor_entry_point");
            A02(A0f, this);
        }
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC43591JPw.A00(928));
        if (A0f.isSampled()) {
            A0f.AAP("set_theme_id", this.A04);
            A01(A00(this.A03), A0f, this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A8R(EnumC39631HiM.AI_GENERATED_THEME, "theme_type");
            A0f.AAP("target_theme_id", str);
            A0f.A8R(this.A00, "set_theme_type");
            A0f.Cht();
        }
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C28457Ch7 c28457Ch7) {
        interfaceC02590Ai.A8R(EnumC39631HiM.AI_GENERATED_THEME, "theme_type");
        interfaceC02590Ai.A8R(c28457Ch7.A00, "set_theme_type");
        interfaceC02590Ai.Cht();
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, C28457Ch7 c28457Ch7, String str) {
        interfaceC02590Ai.AAP("target_theme_id", str);
        interfaceC02590Ai.AAP("set_theme_id", c28457Ch7.A04);
        interfaceC02590Ai.A8R(A00(c28457Ch7.A03), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    public C28457Ch7(C18920wW c18920wW, C3o9 c3o9, String str, String str2, String str3) {
        Object obj;
        EnumC39637HiS enumC39637HiS;
        this.A01 = c18920wW;
        this.A02 = c3o9;
        this.A04 = str2;
        this.A03 = str3;
        if (str.equals("DEFAULT")) {
            enumC39637HiS = EnumC39637HiS.COLOR_GRADIENT;
        } else {
            Iterator<E> it = IBC.A00.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (C14360o3.A0K(((EnumC39637HiS) obj).name(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            enumC39637HiS = (EnumC39637HiS) obj;
        }
        this.A00 = enumC39637HiS;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public static final EnumC46293KeP A00(String str) {
        switch (str.hashCode()) {
            case -2019791911:
                if (str.equals("null_state")) {
                    return EnumC46293KeP.NULL_STATE;
                }
                return EnumC46293KeP.UNDEFINED;
            case -855114483:
                if (str.equals(AbstractC111324zv.A00(1334))) {
                    return EnumC46293KeP.THREAD_DETAILS;
                }
                return EnumC46293KeP.UNDEFINED;
            case -326696768:
                if (str.equals("long_press")) {
                    return EnumC46293KeP.LONG_PRESS;
                }
                return EnumC46293KeP.UNDEFINED;
            case 1936452375:
                if (str.equals(AbstractC43591JPw.A00(125))) {
                    return EnumC46293KeP.ADMIN_MESSAGE;
                }
                return EnumC46293KeP.UNDEFINED;
            default:
                return EnumC46293KeP.UNDEFINED;
        }
    }

    public static void A01(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C28457Ch7 c28457Ch7, String str) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, str);
        C3o9 c3o9 = c28457Ch7.A02;
        interfaceC02590Ai.A7v("is_e2ee", Boolean.valueOf(JRE.A09(c3o9)));
        interfaceC02590Ai.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, JRE.A06(c3o9));
        interfaceC02590Ai.AAP("open_thread_id", AbstractC43827JZq.A01(c3o9));
        interfaceC02590Ai.A9K("occamadillo_thread_id", AbstractC43827JZq.A00(c3o9));
    }
}
