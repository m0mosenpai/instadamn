package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsFooterCell;

/* renamed from: X.MmP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51364MmP extends C3OO {
    public final Context A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final IgdsFooterCell A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51364MmP(AbstractC59962oe abstractC59962oe, UserSession userSession, IgdsFooterCell igdsFooterCell) {
        super(igdsFooterCell);
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = igdsFooterCell;
        this.A00 = abstractC59962oe.requireContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x007d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0019. Please report as an issue. */
    public static final int A00(Integer num, String str) {
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 3) {
                    switch (str.hashCode()) {
                        case 3138974:
                            if (str.equals("feed")) {
                                return 2131969458;
                            }
                            break;
                        case 3230752:
                            if (str.equals("igtv")) {
                                return 2131969459;
                            }
                            break;
                        case 3496474:
                            if (str.equals("reel")) {
                                return 2131969460;
                            }
                            break;
                        case 109770997:
                            if (str.equals("story")) {
                                return 2131969461;
                            }
                            break;
                    }
                }
            } else {
                switch (str.hashCode()) {
                    case 3138974:
                        if (str.equals("feed")) {
                            return 2131953114;
                        }
                        break;
                    case 3230752:
                        if (str.equals("igtv")) {
                            return 2131953115;
                        }
                        break;
                    case 3496474:
                        if (str.equals("reel")) {
                            return 2131953116;
                        }
                        break;
                    case 109770997:
                        if (str.equals("story")) {
                            return 2131953117;
                        }
                        break;
                }
            }
        } else {
            switch (str.hashCode()) {
                case 3138974:
                    if (str.equals("feed")) {
                        return 2131953118;
                    }
                    break;
                case 3230752:
                    if (str.equals("igtv")) {
                        return 2131953119;
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        return 2131953120;
                    }
                    break;
                case 3496474:
                    if (str.equals("reel")) {
                        return 2131953121;
                    }
                    break;
                case 109770997:
                    if (str.equals("story")) {
                        return 2131953122;
                    }
                    break;
            }
        }
        return AbstractC53850Nre.A00(num);
    }
}
