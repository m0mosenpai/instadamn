package X;

import kotlin.Deprecated;

@Deprecated(message = "Use [MediaUfiActions] and [MediaUfiActionHandler] instead")
/* renamed from: X.3qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85103qy extends C0T6 {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;
    public final InterfaceC16820sZ A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final InterfaceC16660sJ A0A;
    public final InterfaceC16660sJ A0B;
    public final InterfaceC16660sJ A0C;
    public final InterfaceC16620sF A0D;
    public final InterfaceC16620sF A0E;
    public final InterfaceC16620sF A0F;
    public final InterfaceC16610sE A0G;
    public final InterfaceC16620sF A0H;
    public final InterfaceC16620sF A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C85103qy) {
                C85103qy c85103qy = (C85103qy) obj;
                if (!C14360o3.A0K(this.A06, c85103qy.A06) || !C14360o3.A0K(this.A08, c85103qy.A08) || !C14360o3.A0K(this.A0C, c85103qy.A0C) || !C14360o3.A0K(this.A0G, c85103qy.A0G) || !C14360o3.A0K(this.A0I, c85103qy.A0I) || !C14360o3.A0K(this.A01, c85103qy.A01) || !C14360o3.A0K(this.A0A, c85103qy.A0A) || !C14360o3.A0K(this.A00, c85103qy.A00) || !C14360o3.A0K(this.A03, c85103qy.A03) || !C14360o3.A0K(this.A04, c85103qy.A04) || !C14360o3.A0K(this.A05, c85103qy.A05) || !C14360o3.A0K(this.A02, c85103qy.A02) || !C14360o3.A0K(this.A0F, c85103qy.A0F) || !C14360o3.A0K(this.A0B, c85103qy.A0B) || !C14360o3.A0K(this.A0E, c85103qy.A0E) || !C14360o3.A0K(this.A09, c85103qy.A09) || !C14360o3.A0K(this.A0D, c85103qy.A0D) || !C14360o3.A0K(this.A0H, c85103qy.A0H) || !C14360o3.A0K(this.A07, c85103qy.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.A06.hashCode() * 31) + this.A08.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0G.hashCode()) * 31) + this.A0I.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A0H.hashCode()) * 31) + this.A07.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaUfiUiActionsDataClass(onUfiVisible=");
        sb.append(this.A06);
        sb.append(", onCommentButtonVisible=");
        sb.append(this.A08);
        sb.append(", onShareButtonVisible=");
        sb.append(this.A0C);
        sb.append(", setupAutomatedLoggingForNativeViews=");
        sb.append(this.A0G);
        sb.append(", setupLithoButtonForAutomatedLogging=");
        sb.append(this.A0I);
        sb.append(", onLikeCountClick=");
        sb.append(this.A01);
        sb.append(", onLikeButtonClick=");
        sb.append(this.A0A);
        sb.append(", onCommentButtonClick=");
        sb.append(this.A00);
        sb.append(", onSaveButtonClick=");
        sb.append(this.A03);
        sb.append(", onSaveButtonLongClick=");
        sb.append(this.A04);
        sb.append(", onShareButtonClick=");
        sb.append(this.A05);
        sb.append(", onMediaWithSharingFrictionShareButtonClick=");
        sb.append(this.A02);
        sb.append(", onShareButtonLongClick=");
        sb.append(this.A0F);
        sb.append(", onShareButtonTouch=");
        sb.append(this.A0B);
        sb.append(", onContentNotesNuxClick=");
        sb.append(this.A0E);
        sb.append(", onContentNotesEntryClick=");
        sb.append(this.A09);
        sb.append(", getPressStateDrawable=");
        sb.append(this.A0D);
        sb.append(", onShowContentNotesToolTip=");
        sb.append(this.A0H);
        sb.append(", onVisualSearchButtonClick=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public C85103qy(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6, InterfaceC16820sZ interfaceC16820sZ7, InterfaceC16820sZ interfaceC16820sZ8, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, InterfaceC16660sJ interfaceC16660sJ5, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, InterfaceC16620sF interfaceC16620sF3, InterfaceC16620sF interfaceC16620sF4, InterfaceC16620sF interfaceC16620sF5, InterfaceC16610sE interfaceC16610sE) {
        this.A06 = interfaceC16820sZ;
        this.A08 = interfaceC16660sJ;
        this.A0C = interfaceC16660sJ2;
        this.A0G = interfaceC16610sE;
        this.A0I = interfaceC16620sF;
        this.A01 = interfaceC16820sZ2;
        this.A0A = interfaceC16660sJ3;
        this.A00 = interfaceC16820sZ3;
        this.A03 = interfaceC16820sZ4;
        this.A04 = interfaceC16820sZ5;
        this.A05 = interfaceC16820sZ6;
        this.A02 = interfaceC16820sZ7;
        this.A0F = interfaceC16620sF2;
        this.A0B = interfaceC16660sJ4;
        this.A0E = interfaceC16620sF3;
        this.A09 = interfaceC16660sJ5;
        this.A0D = interfaceC16620sF4;
        this.A0H = interfaceC16620sF5;
        this.A07 = interfaceC16820sZ8;
    }
}
