package X;

import android.view.View;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.NyL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54240NyL {
    public static final void A00(C54737OFo c54737OFo, C31929E1j c31929E1j) {
        boolean A1R = AbstractC167007dF.A1R(0, c31929E1j, c54737OFo);
        IgdsListCell igdsListCell = c31929E1j.A00;
        igdsListCell.A0I(c54737OFo.A0E);
        String str = c54737OFo.A0C;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C14360o3.A0B(str, 0);
        igdsListCell.A0J(str, str, false);
        EnumC53237Nga enumC53237Nga = c54737OFo.A04;
        if (enumC53237Nga != EnumC53237Nga.A09) {
            igdsListCell.A0G(enumC53237Nga, A1R);
        }
        if (enumC53237Nga == EnumC53237Nga.A08) {
            igdsListCell.setChecked(c54737OFo.A0G);
        }
        if (enumC53237Nga == EnumC53237Nga.A07) {
            igdsListCell.setChecked(c54737OFo.A0F);
        }
        String str3 = c54737OFo.A0D;
        if (str3 != null) {
            str2 = str3;
        }
        igdsListCell.A0H(str2);
        View.OnClickListener onClickListener = c54737OFo.A01;
        if (onClickListener != null) {
            igdsListCell.setClickable(A1R);
            C0fQ.A00(onClickListener, igdsListCell);
            AbstractC56952jT.A01(igdsListCell);
        } else {
            InterfaceC190658cN interfaceC190658cN = c54737OFo.A03;
            if (interfaceC190658cN != null) {
                igdsListCell.setClickable(A1R);
                igdsListCell.A0E(interfaceC190658cN);
            } else {
                View.OnClickListener onClickListener2 = c54737OFo.A02;
                if (onClickListener2 != null) {
                    igdsListCell.setClickable(A1R);
                    igdsListCell.setCompoundButtonClickListener(onClickListener2);
                } else {
                    igdsListCell.setClickable(false);
                    igdsListCell.setOnClickListener(null);
                }
            }
        }
        Integer num = c54737OFo.A05;
        if (num != null) {
            igdsListCell.A05(num.intValue());
        }
        Integer num2 = c54737OFo.A08;
        if (num2 != null) {
            igdsListCell.setSubtitleMaxLine(num2.intValue());
        }
        Integer num3 = c54737OFo.A07;
        if (num3 != null) {
            AbstractC166987dD.A1O(igdsListCell.getContext(), igdsListCell.getSubtitleView(), num3.intValue());
        }
        Integer num4 = c54737OFo.A0A;
        if (num4 != null) {
            AbstractC166987dD.A1O(igdsListCell.getContext(), igdsListCell.getTitleView(), num4.intValue());
        }
        Integer num5 = c54737OFo.A06;
        if (num5 != null) {
            igdsListCell.setIndex(num5.intValue());
        }
    }
}
