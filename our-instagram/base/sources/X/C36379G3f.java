package X;

import android.graphics.RectF;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Map;

/* renamed from: X.G3f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36379G3f implements InterfaceC37171GZi {
    public final /* synthetic */ EOD A00;

    @Override // X.InterfaceC37171GZi
    public final void D2m(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, Integer num) {
        String str;
        C35267Fh2 c35267Fh2;
        Integer num2;
        String A02;
        Long l;
        Map map;
        String str2;
        Integer num3;
        C14360o3.A0B(directThreadKey, 0);
        EOD eod = this.A00;
        if (eod instanceof C32727Eas) {
            C32727Eas c32727Eas = (C32727Eas) eod;
            str = directThreadKey.A00;
            if (str != null) {
                ((ChannelDiscoveryViewModel) c32727Eas.A01.getValue()).A0F(str);
                c35267Fh2 = (C35267Fh2) ((EOD) c32727Eas).A04.getValue();
                if (directShareTarget != null) {
                    num3 = Integer.valueOf(directShareTarget.A01);
                } else {
                    num3 = null;
                }
                A02 = C35267Fh2.A02(num3);
                if (num != null) {
                    l = AbstractC25229BEm.A0n(num);
                } else {
                    l = null;
                }
                map = null;
                str2 = "inbox_directory_sheet";
            } else {
                return;
            }
        } else {
            C32726Ear c32726Ear = (C32726Ear) eod;
            str = directThreadKey.A00;
            if (str == null) {
                return;
            }
            ((ChannelDiscoveryViewModel) c32726Ear.A00.getValue()).A0F(str);
            c35267Fh2 = (C35267Fh2) c32726Ear.A04.getValue();
            if (directShareTarget != null) {
                num2 = Integer.valueOf(directShareTarget.A01);
            } else {
                num2 = null;
            }
            A02 = C35267Fh2.A02(num2);
            if (num != null) {
                l = AbstractC25229BEm.A0n(num);
            } else {
                l = null;
            }
            map = null;
            str2 = "inbox_invites_sheet";
        }
        C35267Fh2.A07(c35267Fh2, l, str, A02, str2, map);
    }

    @Override // X.InterfaceC37171GZi
    public final void E2R(DirectShareTarget directShareTarget, C3o9 c3o9) {
    }

    @Override // X.InterfaceC37171GZi
    public final void EH7(RectF rectF, DirectThreadKey directThreadKey) {
    }

    public C36379G3f(EOD eod) {
        this.A00 = eod;
    }
}
