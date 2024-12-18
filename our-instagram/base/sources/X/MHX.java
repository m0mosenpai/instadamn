package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.instagram.pando.livetree.LiveTreeJNI;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class MHX extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHX(C76223bS c76223bS, CVO cvo, C26521Bng c26521Bng, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A04 = c26521Bng;
        switch (i2) {
            case 18:
            case Process.SIGSTOP /* 19 */:
            case 20:
                this.A03 = c76223bS;
                this.A01 = i;
                this.A02 = cvo;
                break;
            default:
                this.A02 = c76223bS;
                this.A01 = i;
                this.A03 = cvo;
                break;
        }
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        TreeJNI optionalTreeValueNative;
        InterfaceC16610sE interfaceC16610sE;
        Object obj;
        Integer valueOf;
        Object obj2;
        List optionalTreeListNative;
        switch (this.A00) {
            case 0:
                ((XP9) this.A02).ClE(this.A01, LF9.A00((Throwable) this.A03));
                return C0eB.A00;
            case 1:
            case 2:
                interfaceC16610sE = (InterfaceC16610sE) this.A03;
                obj = this.A02;
                valueOf = Integer.valueOf(this.A01);
                obj2 = ((C50726MaR) this.A04).A02;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                interfaceC16610sE = (InterfaceC16610sE) this.A04;
                obj = this.A02;
                valueOf = Integer.valueOf(this.A01);
                obj2 = this.A03;
                break;
            case 11:
                ((LinearLayoutManager) this.A03).A1p(this.A01, C8BW.A00(AbstractC166997dE.A0L((View) this.A04), ((C8Ba) this.A02).A02));
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                KQX kqx = (KQX) this.A04;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                kqx.A02.DHj((C43792JYf) this.A02, this.A01);
                kqx.A01((JUS) this.A03);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C43792JYf c43792JYf = (C43792JYf) this.A03;
                boolean A0K = C14360o3.A0K(c43792JYf.A00, C2057498z.A00);
                JYV jyv = (JYV) this.A04;
                if (!A0K) {
                    Number number = jyv.A00;
                    if (number != null) {
                        jyv.A00 = Integer.valueOf(((C3OO) this.A02).getAbsoluteAdapterPosition());
                        jyv.notifyItemChanged(number.intValue());
                        Number number2 = jyv.A00;
                        if (number2 != null) {
                            jyv.notifyItemChanged(number2.intValue());
                        }
                    }
                    C14360o3.A0F("currentSelectedPosition");
                    throw C00O.createAndThrow();
                }
                jyv.A01.DHj(c43792JYf, this.A01);
                return C0eB.A00;
            case 14:
            case Process.SIGTERM /* 15 */:
                interfaceC16610sE = (InterfaceC16610sE) this.A03;
                obj = ((C26010Bey) this.A02).A04;
                valueOf = Integer.valueOf(this.A01);
                obj2 = this.A04;
                break;
            case 16:
                optionalTreeListNative = ((LiveTreeJNI) this.A04).getOptionalTreeListNative(this.A01, (Class) this.A03);
                if (optionalTreeListNative != null) {
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = optionalTreeListNative.iterator();
                    while (it.hasNext()) {
                        Object invoke = interfaceC16660sJ.invoke(it.next());
                        if (invoke != null) {
                            A1E.add(invoke);
                        }
                    }
                    return A1E;
                }
                return null;
            case 17:
                optionalTreeValueNative = ((LiveTreeJNI) this.A04).getOptionalTreeValueNative(this.A01, (Class) this.A03);
                if (optionalTreeValueNative != null) {
                    return ((InterfaceC16660sJ) this.A02).invoke(optionalTreeValueNative);
                }
                return null;
            case 18:
            case 20:
                C76223bS c76223bS = (C76223bS) this.A03;
                int i2 = this.A01;
                CVO cvo = (CVO) this.A02;
                int i3 = cvo.A00;
                int i4 = cvo.A01;
                int A0l = AbstractC25232BEp.A0l(c76223bS, 0.0d);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i2);
                gradientDrawable.setStroke(A0l, i3);
                gradientDrawable.setCornerRadius(AbstractC25232BEp.A0l(c76223bS, i4));
                return gradientDrawable;
            case Process.SIGSTOP /* 19 */:
                return AbstractC09440dt.A01(new MHX((C76223bS) this.A03, (CVO) this.A02, (C26521Bng) this.A04, this.A01, 18));
            case 21:
                C76223bS c76223bS2 = (C76223bS) this.A02;
                int i5 = this.A01;
                CVO cvo2 = (CVO) this.A03;
                int i6 = cvo2.A00;
                int i7 = cvo2.A01;
                int A0l2 = AbstractC25232BEp.A0l(c76223bS2, 0.0d);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(i5);
                gradientDrawable2.setStroke(A0l2, i6);
                gradientDrawable2.setCornerRadius(AbstractC25232BEp.A0l(c76223bS2, i7));
                return gradientDrawable2;
            case 22:
                return BV5.A03((C51722Yv) this.A02, (C38321qM) this.A03, (BV5) this.A04, this.A01);
        }
        interfaceC16610sE.invoke(obj, valueOf, obj2);
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHX(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A04 = obj2;
        this.A03 = obj3;
    }
}
