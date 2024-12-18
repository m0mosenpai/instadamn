package X;

import androidx.media3.common.util.Util;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.google.common.collect.ImmutableList;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class WSC implements InterfaceC71879X8m {
    public final int A00;
    public final ImmutableList A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0083. Please report as an issue. */
    public static WSC A00(WFa wFa, int i) {
        InterfaceC71879X8m ws9;
        StringBuilder sb;
        String str;
        int A03;
        String str2;
        int i2;
        C70116W4o c70116W4o;
        String str3;
        String str4;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i3 = wFa.A00;
        char c = 65534;
        while (wFa.A00 - wFa.A01 > 8) {
            int A02 = wFa.A02();
            int A022 = wFa.A01 + wFa.A02();
            wFa.A0N(A022);
            if (A02 == 1414744396) {
                ws9 = A00(wFa, wFa.A02());
            } else {
                switch (A02) {
                    case 1718776947:
                        if (c == 2) {
                            wFa.A0P(4);
                            int A023 = wFa.A02();
                            int A024 = wFa.A02();
                            wFa.A0P(4);
                            A03 = wFa.A02();
                            switch (A03) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str4 = "video/mp4v-es";
                                    c70116W4o = new C70116W4o();
                                    c70116W4o.A0L = A023;
                                    c70116W4o.A09 = A024;
                                    c70116W4o.A00(str4);
                                    ws9 = new WS8(new C70130W5r(c70116W4o));
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str4 = "video/avc";
                                    c70116W4o = new C70116W4o();
                                    c70116W4o.A0L = A023;
                                    c70116W4o.A09 = A024;
                                    c70116W4o.A00(str4);
                                    ws9 = new WS8(new C70130W5r(c70116W4o));
                                    break;
                                case 842289229:
                                    str4 = "video/mp42";
                                    c70116W4o = new C70116W4o();
                                    c70116W4o.A0L = A023;
                                    c70116W4o.A09 = A024;
                                    c70116W4o.A00(str4);
                                    ws9 = new WS8(new C70130W5r(c70116W4o));
                                    break;
                                case 859066445:
                                    str4 = "video/mp43";
                                    c70116W4o = new C70116W4o();
                                    c70116W4o.A0L = A023;
                                    c70116W4o.A09 = A024;
                                    c70116W4o.A00(str4);
                                    ws9 = new WS8(new C70130W5r(c70116W4o));
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str4 = "video/mjpeg";
                                    c70116W4o = new C70116W4o();
                                    c70116W4o.A0L = A023;
                                    c70116W4o.A09 = A024;
                                    c70116W4o.A00(str4);
                                    ws9 = new WS8(new C70130W5r(c70116W4o));
                                    break;
                                default:
                                    sb = new StringBuilder();
                                    str3 = "Ignoring track with unsupported compression ";
                                    sb.append(str3);
                                    sb.append(A03);
                                    AbstractC63374Sil.A04("StreamFormatChunk", sb.toString());
                                    break;
                            }
                        } else if (c == 1) {
                            A03 = wFa.A03();
                            if (A03 != 1) {
                                if (A03 != 85) {
                                    if (A03 != 255) {
                                        if (A03 != 8192) {
                                            if (A03 != 8193) {
                                                sb = new StringBuilder();
                                                str3 = "Ignoring track with unsupported format tag ";
                                                sb.append(str3);
                                                sb.append(A03);
                                                AbstractC63374Sil.A04("StreamFormatChunk", sb.toString());
                                            } else {
                                                str2 = "audio/vnd.dts";
                                            }
                                        } else {
                                            str2 = "audio/ac3";
                                        }
                                    } else {
                                        str2 = "audio/mp4a-latm";
                                    }
                                } else {
                                    str2 = "audio/mpeg";
                                }
                            } else {
                                str2 = "audio/raw";
                            }
                            int A032 = wFa.A03();
                            int A025 = wFa.A02();
                            wFa.A0P(6);
                            int A00 = Util.A00(wFa.A03());
                            if (wFa.A00 - wFa.A01 > 0) {
                                i2 = wFa.A03();
                            } else {
                                i2 = 0;
                            }
                            byte[] bArr = new byte[i2];
                            wFa.A0R(bArr, 0, i2);
                            c70116W4o = new C70116W4o();
                            c70116W4o.A00(str2);
                            c70116W4o.A04 = A032;
                            c70116W4o.A0G = A025;
                            if ("audio/raw".equals(str2) && A00 != 0) {
                                c70116W4o.A0C = A00;
                            }
                            if ("audio/mp4a-latm".equals(str2) && i2 > 0) {
                                c70116W4o.A0X = ImmutableList.of((Object) bArr);
                            }
                            ws9 = new WS8(new C70130W5r(c70116W4o));
                        } else {
                            sb = new StringBuilder();
                            sb.append("Ignoring strf box for unsupported track type: ");
                            switch (c) {
                                case 65534:
                                    str = NetInfoModule.CONNECTION_TYPE_NONE;
                                    break;
                                case 65535:
                                    str = "unknown";
                                    break;
                                case 0:
                                default:
                                    str = "camera motion";
                                    break;
                                case 1:
                                    str = MediaStreamTrack.AUDIO_TRACK_KIND;
                                    break;
                                case 2:
                                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                                    break;
                                case 3:
                                    str = "text";
                                    break;
                            }
                            sb.append(str);
                            AbstractC63374Sil.A04("StreamFormatChunk", sb.toString());
                        }
                    case 1751742049:
                        int A026 = wFa.A02();
                        wFa.A0P(8);
                        int A027 = wFa.A02();
                        int A028 = wFa.A02();
                        wFa.A0P(4);
                        wFa.A02();
                        wFa.A0P(12);
                        ws9 = new WSA(A026, A027, A028);
                        break;
                    case 1752331379:
                        int A029 = wFa.A02();
                        wFa.A0P(12);
                        wFa.A02();
                        int A0210 = wFa.A02();
                        int A0211 = wFa.A02();
                        wFa.A0P(4);
                        int A0212 = wFa.A02();
                        int A0213 = wFa.A02();
                        wFa.A0P(8);
                        ws9 = new WSB(A029, A0210, A0211, A0212, A0213);
                        break;
                    case 1852994675:
                        ws9 = new WS9(wFa.A0I(AbstractC50482Ts.A05, wFa.A00 - wFa.A01));
                        break;
                }
            }
            if (ws9.getType() == 1752331379) {
                int i4 = ((WSB) ws9).A03;
                if (i4 != 1935960438) {
                    if (i4 != 1935963489) {
                        if (i4 != 1937012852) {
                            AbstractC63374Sil.A04("AviStreamHeaderChunk", AnonymousClass001.A0R("Found unsupported streamType fourCC: ", Integer.toHexString(i4)));
                            c = 65535;
                        } else {
                            c = 3;
                        }
                    } else {
                        c = 1;
                    }
                } else {
                    c = 2;
                }
            }
            builder.add((Object) ws9);
            wFa.A0O(A022);
            wFa.A0N(i3);
        }
        return new WSC(builder.build(), i);
    }

    public final InterfaceC71879X8m A01(Class cls) {
        C1LC it = this.A01.iterator();
        while (it.hasNext()) {
            InterfaceC71879X8m interfaceC71879X8m = (InterfaceC71879X8m) it.next();
            if (interfaceC71879X8m.getClass() == cls) {
                return interfaceC71879X8m;
            }
        }
        return null;
    }

    @Override // X.InterfaceC71879X8m
    public final int getType() {
        return this.A00;
    }

    public WSC(ImmutableList immutableList, int i) {
        this.A00 = i;
        this.A01 = immutableList;
    }
}
