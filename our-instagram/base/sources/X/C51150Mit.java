package X;

import android.view.ViewGroup;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.Mit, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51150Mit extends C2UU {
    public final UserSession A00;
    public final AbstractC53643Nno A01;
    public final EnumC53117NeU A02;
    public final List A03;

    public C51150Mit(UserSession userSession, AbstractC53643Nno abstractC53643Nno, EnumC53117NeU enumC53117NeU) {
        C14360o3.A0B(userSession, 2);
        this.A01 = abstractC53643Nno;
        this.A00 = userSession;
        this.A02 = enumC53117NeU;
        this.A03 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        EnumC114925Hg enumC114925Hg;
        P0O p0o;
        P14 p14;
        C51276Mkz c51276Mkz = (C51276Mkz) c3oo;
        C14360o3.A0B(c51276Mkz, 0);
        AbstractC53462Nkp abstractC53462Nkp = (AbstractC53462Nkp) this.A03.get(i);
        if (abstractC53462Nkp instanceof NJX) {
            InterfaceC58169PqZ interfaceC58169PqZ = c51276Mkz.A00;
            if ((interfaceC58169PqZ instanceof P14) && (p14 = (P14) interfaceC58169PqZ) != null) {
                p14.A00(((NJX) abstractC53462Nkp).A00);
                return;
            }
            return;
        }
        if (abstractC53462Nkp instanceof NJU) {
            InterfaceC58169PqZ interfaceC58169PqZ2 = c51276Mkz.A00;
            if (!(interfaceC58169PqZ2 instanceof P0O) || (p0o = (P0O) interfaceC58169PqZ2) == null) {
                return;
            }
            PublishScreenCategoryType publishScreenCategoryType = ((NJU) abstractC53462Nkp).A00;
            C14360o3.A0B(publishScreenCategoryType, 0);
            p0o.A00 = publishScreenCategoryType;
            C50821Mcw A04 = p0o.A04();
            AbstractC59962oe abstractC59962oe = p0o.A02;
            A04.setTitle(AbstractC166997dE.A0N(abstractC59962oe).getString(OOu.A01(publishScreenCategoryType)));
            p0o.A04().setIcon(abstractC59962oe.requireContext().getDrawable(OOu.A00(publishScreenCategoryType)));
            ViewOnClickListenerC55465OkK.A01(p0o.A04(), 11, publishScreenCategoryType, p0o);
            return;
        }
        if (!(abstractC53462Nkp instanceof NJV)) {
            return;
        }
        InterfaceC58169PqZ interfaceC58169PqZ3 = c51276Mkz.A00;
        interfaceC58169PqZ3.ADu();
        int ordinal = this.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                enumC114925Hg = EnumC114925Hg.FEED;
            } else {
                throw B4Z.A00();
            }
        } else {
            enumC114925Hg = EnumC114925Hg.CLIPS;
        }
        AnonymousClass229.A01(this.A00).A15(enumC114925Hg, interfaceC58169PqZ3.BIL());
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(78265341);
        int size = this.A03.size();
        C0f9.A0A(24171618, A03);
        return size;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003a. Please report as an issue. */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        B4Z A00;
        int i2;
        int i3;
        int i4;
        int A03 = C0f9.A03(1482827877);
        AbstractC53462Nkp abstractC53462Nkp = (AbstractC53462Nkp) this.A03.get(i);
        if (abstractC53462Nkp instanceof NJU) {
            i3 = 41;
            i4 = -1818932689;
        } else if (abstractC53462Nkp instanceof NJX) {
            i3 = 1;
            i4 = -841449518;
        } else if (abstractC53462Nkp instanceof NJW) {
            i3 = 2;
            i4 = -109789592;
        } else {
            if (!(abstractC53462Nkp instanceof NJV)) {
                A00 = B4Z.A00();
                i2 = 1453384946;
            } else {
                switch (((NJV) abstractC53462Nkp).A00.intValue()) {
                    case 0:
                        i3 = 3;
                        i4 = -307039048;
                        break;
                    case 1:
                        i3 = 42;
                        i4 = -307039048;
                        break;
                    case 2:
                        i3 = 38;
                        i4 = -307039048;
                        break;
                    case 3:
                        i3 = 50;
                        i4 = -307039048;
                        break;
                    case 4:
                        i3 = 4;
                        i4 = -307039048;
                        break;
                    case 5:
                        i3 = 5;
                        i4 = -307039048;
                        break;
                    case 6:
                        i3 = 6;
                        i4 = -307039048;
                        break;
                    case 7:
                        i3 = 7;
                        i4 = -307039048;
                        break;
                    case 8:
                        i3 = 8;
                        i4 = -307039048;
                        break;
                    case 9:
                        i3 = 31;
                        i4 = -307039048;
                        break;
                    case 10:
                        i3 = 9;
                        i4 = -307039048;
                        break;
                    case 11:
                        i3 = 10;
                        i4 = -307039048;
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        i3 = 39;
                        i4 = -307039048;
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        i3 = 11;
                        i4 = -307039048;
                        break;
                    case 14:
                        i3 = 12;
                        i4 = -307039048;
                        break;
                    case Process.SIGTERM /* 15 */:
                        i3 = 35;
                        i4 = -307039048;
                        break;
                    case 16:
                        i3 = 13;
                        i4 = -307039048;
                        break;
                    case 17:
                        i3 = 37;
                        i4 = -307039048;
                        break;
                    case 18:
                        i3 = 14;
                        i4 = -307039048;
                        break;
                    case Process.SIGSTOP /* 19 */:
                        i3 = 15;
                        i4 = -307039048;
                        break;
                    case 20:
                        i3 = 16;
                        i4 = -307039048;
                        break;
                    case 21:
                        i3 = 17;
                        i4 = -307039048;
                        break;
                    case 22:
                        i3 = 18;
                        i4 = -307039048;
                        break;
                    case 23:
                        i3 = 19;
                        i4 = -307039048;
                        break;
                    case 24:
                        i3 = 20;
                        i4 = -307039048;
                        break;
                    case 25:
                        i3 = 21;
                        i4 = -307039048;
                        break;
                    case 26:
                        i3 = 22;
                        i4 = -307039048;
                        break;
                    case 27:
                        i3 = 36;
                        i4 = -307039048;
                        break;
                    case 28:
                        i3 = 40;
                        i4 = -307039048;
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        i3 = 24;
                        i4 = -307039048;
                        break;
                    case 30:
                        i3 = 26;
                        i4 = -307039048;
                        break;
                    case 31:
                        i3 = 27;
                        i4 = -307039048;
                        break;
                    case 32:
                        i3 = 28;
                        i4 = -307039048;
                        break;
                    case 33:
                        i3 = 32;
                        i4 = -307039048;
                        break;
                    case 34:
                        i3 = 33;
                        i4 = -307039048;
                        break;
                    case 35:
                        i3 = 34;
                        i4 = -307039048;
                        break;
                    case 36:
                        i3 = 29;
                        i4 = -307039048;
                        break;
                    case 37:
                        i3 = 30;
                        i4 = -307039048;
                        break;
                    case 38:
                        i3 = 43;
                        i4 = -307039048;
                        break;
                    case 39:
                        i3 = 44;
                        i4 = -307039048;
                        break;
                    case 40:
                        i3 = 45;
                        i4 = -307039048;
                        break;
                    case Seq.NULL_REFNUM /* 41 */:
                        i3 = 47;
                        i4 = -307039048;
                        break;
                    case Seq.RefTracker.REF_OFFSET /* 42 */:
                        i3 = 52;
                        i4 = -307039048;
                        break;
                    case 43:
                        i3 = 48;
                        i4 = -307039048;
                        break;
                    case 44:
                        i3 = 49;
                        i4 = -307039048;
                        break;
                    case 45:
                        i3 = 51;
                        i4 = -307039048;
                        break;
                    default:
                        A00 = B4Z.A00();
                        i2 = -2018190864;
                        break;
                }
            }
            C0f9.A0A(i2, A03);
            throw A00;
        }
        C0f9.A0A(i4, A03);
        return i3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Integer num;
        AbstractC53643Nno abstractC53643Nno;
        AbstractC53462Nkp nju;
        switch (i) {
            case 1:
                abstractC53643Nno = this.A01;
                nju = new NJX(null);
                InterfaceC58169PqZ A05 = abstractC53643Nno.A05(nju);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05.ANR(), this, A05);
            case 2:
                abstractC53643Nno = this.A01;
                nju = NJW.A00;
                InterfaceC58169PqZ A052 = abstractC53643Nno.A05(nju);
                int i22 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052.ANR(), this, A052);
            case 3:
                num = C05F.A00;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522 = abstractC53643Nno.A05(nju);
                int i222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522.ANR(), this, A0522);
            case 4:
                num = C05F.A0Y;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222 = abstractC53643Nno.A05(nju);
                int i2222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222.ANR(), this, A05222);
            case 5:
                num = C05F.A0j;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222 = abstractC53643Nno.A05(nju);
                int i22222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222.ANR(), this, A052222);
            case 6:
                num = C05F.A0u;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222 = abstractC53643Nno.A05(nju);
                int i222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222.ANR(), this, A0522222);
            case 7:
                num = C05F.A15;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222 = abstractC53643Nno.A05(nju);
                int i2222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222.ANR(), this, A05222222);
            case 8:
                num = C05F.A1F;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222 = abstractC53643Nno.A05(nju);
                int i22222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222.ANR(), this, A052222222);
            case 9:
                num = C05F.A02;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222 = abstractC53643Nno.A05(nju);
                int i222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222.ANR(), this, A0522222222);
            case 10:
                num = C05F.A03;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222 = abstractC53643Nno.A05(nju);
                int i2222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222.ANR(), this, A05222222222);
            case 11:
                num = C05F.A05;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222 = abstractC53643Nno.A05(nju);
                int i22222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222.ANR(), this, A052222222222);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                num = C05F.A06;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222 = abstractC53643Nno.A05(nju);
                int i222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222.ANR(), this, A0522222222222);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                num = C05F.A08;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222.ANR(), this, A05222222222222);
            case 14:
                num = C05F.A0A;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222.ANR(), this, A052222222222222);
            case Process.SIGTERM /* 15 */:
                num = C05F.A0B;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222.ANR(), this, A0522222222222222);
            case 16:
                num = C05F.A0D;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222.ANR(), this, A05222222222222222);
            case 17:
                num = C05F.A0E;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222.ANR(), this, A052222222222222222);
            case 18:
                num = C05F.A0F;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222.ANR(), this, A0522222222222222222);
            case Process.SIGSTOP /* 19 */:
                num = C05F.A0G;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222.ANR(), this, A05222222222222222222);
            case 20:
                num = C05F.A0H;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222.ANR(), this, A052222222222222222222);
            case 21:
                num = C05F.A0I;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222.ANR(), this, A0522222222222222222222);
            case 22:
                num = C05F.A0J;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222.ANR(), this, A05222222222222222222222);
            case 23:
            case 25:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            default:
                throw AbstractC25230BEn.A0n("Unknown view type ", i);
            case 24:
                num = C05F.A0M;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222.ANR(), this, A052222222222222222222222);
            case 26:
                num = C05F.A0O;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222.ANR(), this, A0522222222222222222222222);
            case 27:
                num = C05F.A0P;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222.ANR(), this, A05222222222222222222222222);
            case 28:
                num = C05F.A0Q;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222.ANR(), this, A052222222222222222222222222);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                num = C05F.A0U;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222.ANR(), this, A0522222222222222222222222222);
            case 30:
                num = C05F.A0V;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222.ANR(), this, A05222222222222222222222222222);
            case 31:
                num = C05F.A1I;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222.ANR(), this, A052222222222222222222222222222);
            case 32:
                num = C05F.A0R;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222.ANR(), this, A0522222222222222222222222222222);
            case 33:
                num = C05F.A0S;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222);
            case 34:
                num = C05F.A0T;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222222.ANR(), this, A052222222222222222222222222222222);
            case 35:
                num = C05F.A07;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222222.ANR(), this, A0522222222222222222222222222222222);
            case 36:
                num = C05F.A0K;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222222);
            case 37:
                num = C05F.A09;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222222222.ANR(), this, A052222222222222222222222222222222222);
            case 38:
                num = C05F.A0C;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222222222.ANR(), this, A0522222222222222222222222222222222222);
            case 39:
                num = C05F.A04;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222222222);
            case 40:
                num = C05F.A0L;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222222222222.ANR(), this, A052222222222222222222222222222222222222);
            case Seq.NULL_REFNUM /* 41 */:
                abstractC53643Nno = this.A01;
                nju = new NJU(PublishScreenCategoryType.A06);
                InterfaceC58169PqZ A0522222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222222222222.ANR(), this, A0522222222222222222222222222222222222222);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                num = C05F.A01;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222222222222);
            case 43:
                num = C05F.A0W;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222222222222222.ANR(), this, A052222222222222222222222222222222222222222);
            case 44:
                num = C05F.A0X;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222222222222222.ANR(), this, A0522222222222222222222222222222222222222222);
            case 45:
                num = C05F.A0Z;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222222222222222);
            case 47:
                num = C05F.A0a;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222222222222222222.ANR(), this, A052222222222222222222222222222222222222222222);
            case 48:
                num = C05F.A0c;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222222222222222222.ANR(), this, A0522222222222222222222222222222222222222222222);
            case 49:
                num = C05F.A0d;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222222222222222222);
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                num = C05F.A0N;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A052222222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i22222222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A052222222222222222222222222222222222222222222222.ANR(), this, A052222222222222222222222222222222222222222222222);
            case 51:
                num = C05F.A0e;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A0522222222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i222222222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A0522222222222222222222222222222222222222222222222.ANR(), this, A0522222222222222222222222222222222222222222222222);
            case 52:
                num = C05F.A0b;
                abstractC53643Nno = this.A01;
                nju = new NJV(num);
                InterfaceC58169PqZ A05222222222222222222222222222222222222222222222222 = abstractC53643Nno.A05(nju);
                int i2222222222222222222222222222222222222222222222222 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51276Mkz(A05222222222222222222222222222222222222222222222222.ANR(), this, A05222222222222222222222222222222222222222222222222);
        }
    }
}
