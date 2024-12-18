package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Iterator;

/* loaded from: classes8.dex */
public abstract class LH5 {
    public static void A01(InterfaceC02590Ai interfaceC02590Ai, Integer num, Integer num2) {
        Object obj;
        Object obj2;
        EnumC39637HiS enumC39637HiS;
        Iterator<E> it = IBR.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((EnumC39631HiM) obj).name(), AbstractC40577Hyx.A00(num))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        interfaceC02590Ai.A8R((EnumC39631HiM) obj, "theme_type");
        if (num2 == C05F.A0N) {
            enumC39637HiS = EnumC39637HiS.COLOR_GRADIENT;
        } else {
            Iterator<E> it2 = IBR.A00.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (C14360o3.A0K(((EnumC39637HiS) obj2).name(), AbstractC40577Hyx.A00(num2))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            enumC39637HiS = (EnumC39637HiS) obj2;
        }
        interfaceC02590Ai.A8R(enumC39637HiS, "set_theme_type");
        interfaceC02590Ai.Cht();
    }

    public static final void A02(C18920wW c18920wW, InterfaceC83713oG interfaceC83713oG, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4310));
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A1A(A0f, AbstractC140946Yw.A07(interfaceC83713oG));
            AbstractC31171DnF.A1F(A0f, str);
            A0f.A8R(A00(str2), ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC31171DnF.A1H(A0f, AbstractC92784Dr.A02(interfaceC83713oG));
            A0f.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
            A0f.Cht();
        }
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
                if (str.equals("thread_details")) {
                    return EnumC46293KeP.THREAD_DETAILS;
                }
                return EnumC46293KeP.UNDEFINED;
            case -326696768:
                if (str.equals("long_press")) {
                    return EnumC46293KeP.LONG_PRESS;
                }
                return EnumC46293KeP.UNDEFINED;
            case 1936452375:
                if (str.equals("admin_message")) {
                    return EnumC46293KeP.ADMIN_MESSAGE;
                }
                return EnumC46293KeP.UNDEFINED;
            default:
                return EnumC46293KeP.UNDEFINED;
        }
    }
}
