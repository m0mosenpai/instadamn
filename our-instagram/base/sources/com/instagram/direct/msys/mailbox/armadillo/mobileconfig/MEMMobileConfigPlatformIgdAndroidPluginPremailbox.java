package com.instagram.direct.msys.mailbox.armadillo.mobileconfig;

import X.AbstractC62862SUj;
import X.C14360o3;
import X.C47162Ei;
import X.C66Z;
import X.C8S8;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.common.session.UserSession;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes3.dex */
public final class MEMMobileConfigPlatformIgdAndroidPluginPremailbox extends Premailbox {
    @Override // com.instagram.direct.msys.mailbox.armadillo.mobileconfig.Premailbox
    public void MEMMobileConfigPlatformIgdAndroidPluginPremailboxExtensionsDestroy() {
    }

    @Override // com.instagram.direct.msys.mailbox.armadillo.mobileconfig.Premailbox
    public String MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformCopyString(int i, String str, boolean z) {
        C47162Ei c47162Ei;
        Object A00;
        if (i != 562) {
            if (i != 569) {
                if (i == 570) {
                    UserSession userSession = this.mAppContext;
                    C14360o3.A06(userSession);
                    c47162Ei = C66Z.A00(userSession).A1w;
                } else {
                    return str;
                }
            } else {
                UserSession userSession2 = this.mAppContext;
                C14360o3.A06(userSession2);
                c47162Ei = C66Z.A00(userSession2).A1p;
            }
            if (z) {
                A00 = c47162Ei.get();
            } else {
                A00 = c47162Ei.A00();
            }
            return (String) A00;
        }
        return "igdMobile";
    }

    @Override // com.instagram.direct.msys.mailbox.armadillo.mobileconfig.Premailbox
    public boolean MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetBoolean(int i, boolean z, boolean z2) {
        C47162Ei c47162Ei;
        Object A00;
        if (i != 25) {
            if (i != 26) {
                if (i != 29) {
                    if (i != 30) {
                        if (i != 50) {
                            if (i != 51) {
                                if (i != 104) {
                                    if (i != 105) {
                                        if (i != 117) {
                                            if (i != 118) {
                                                switch (i) {
                                                    case 5:
                                                        UserSession userSession = this.mAppContext;
                                                        C14360o3.A06(userSession);
                                                        c47162Ei = C66Z.A00(userSession).A00;
                                                        break;
                                                    case 8:
                                                        UserSession userSession2 = this.mAppContext;
                                                        C14360o3.A06(userSession2);
                                                        c47162Ei = C66Z.A00(userSession2).A01;
                                                        break;
                                                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                                        UserSession userSession3 = this.mAppContext;
                                                        C14360o3.A06(userSession3);
                                                        c47162Ei = C66Z.A00(userSession3).A04;
                                                        break;
                                                    case 16:
                                                        UserSession userSession4 = this.mAppContext;
                                                        C14360o3.A06(userSession4);
                                                        c47162Ei = C66Z.A00(userSession4).A08;
                                                        break;
                                                    case 18:
                                                    case 193:
                                                    case 321:
                                                    case 326:
                                                    case 334:
                                                    case 335:
                                                    case 388:
                                                    case 389:
                                                    case 406:
                                                    case 439:
                                                        return false;
                                                    case 35:
                                                        UserSession userSession5 = this.mAppContext;
                                                        C14360o3.A06(userSession5);
                                                        c47162Ei = C66Z.A00(userSession5).A0D;
                                                        break;
                                                    case 57:
                                                    case 80:
                                                    case 81:
                                                    case 152:
                                                    case 167:
                                                    case 203:
                                                    case 319:
                                                    case 320:
                                                    case 323:
                                                    case ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI /* 400 */:
                                                    case 445:
                                                        return true;
                                                    case 61:
                                                        UserSession userSession6 = this.mAppContext;
                                                        C14360o3.A06(userSession6);
                                                        c47162Ei = C66Z.A00(userSession6).A0H;
                                                        break;
                                                    case 77:
                                                        UserSession userSession7 = this.mAppContext;
                                                        C14360o3.A06(userSession7);
                                                        c47162Ei = C66Z.A00(userSession7).A0I;
                                                        break;
                                                    case 78:
                                                        UserSession userSession8 = this.mAppContext;
                                                        C14360o3.A06(userSession8);
                                                        c47162Ei = C66Z.A00(userSession8).A0K;
                                                        break;
                                                    case 79:
                                                        UserSession userSession9 = this.mAppContext;
                                                        C14360o3.A06(userSession9);
                                                        c47162Ei = C66Z.A00(userSession9).A0J;
                                                        break;
                                                    case 82:
                                                        UserSession userSession10 = this.mAppContext;
                                                        C14360o3.A06(userSession10);
                                                        c47162Ei = C66Z.A00(userSession10).A0L;
                                                        break;
                                                    case 87:
                                                        UserSession userSession11 = this.mAppContext;
                                                        C14360o3.A06(userSession11);
                                                        c47162Ei = C66Z.A00(userSession11).A0M;
                                                        break;
                                                    case 90:
                                                        UserSession userSession12 = this.mAppContext;
                                                        C14360o3.A06(userSession12);
                                                        c47162Ei = C66Z.A00(userSession12).A0N;
                                                        break;
                                                    case 110:
                                                        UserSession userSession13 = this.mAppContext;
                                                        C14360o3.A06(userSession13);
                                                        c47162Ei = C66Z.A00(userSession13).A0T;
                                                        break;
                                                    case 112:
                                                        UserSession userSession14 = this.mAppContext;
                                                        C14360o3.A06(userSession14);
                                                        c47162Ei = C66Z.A00(userSession14).A0U;
                                                        break;
                                                    case HucClient.BODY_UPLOAD_TIMEOUT_SECONDS /* 120 */:
                                                        UserSession userSession15 = this.mAppContext;
                                                        C14360o3.A06(userSession15);
                                                        c47162Ei = C66Z.A00(userSession15).A0X;
                                                        break;
                                                    case 150:
                                                        UserSession userSession16 = this.mAppContext;
                                                        C14360o3.A06(userSession16);
                                                        c47162Ei = C66Z.A00(userSession16).A0j;
                                                        break;
                                                    case 151:
                                                        UserSession userSession17 = this.mAppContext;
                                                        C14360o3.A06(userSession17);
                                                        c47162Ei = C66Z.A00(userSession17).A0i;
                                                        break;
                                                    case 153:
                                                        UserSession userSession18 = this.mAppContext;
                                                        C14360o3.A06(userSession18);
                                                        c47162Ei = C66Z.A00(userSession18).A0k;
                                                        break;
                                                    case 155:
                                                        UserSession userSession19 = this.mAppContext;
                                                        C14360o3.A06(userSession19);
                                                        c47162Ei = C66Z.A00(userSession19).A0l;
                                                        break;
                                                    case 156:
                                                        UserSession userSession20 = this.mAppContext;
                                                        C14360o3.A06(userSession20);
                                                        c47162Ei = C66Z.A00(userSession20).A0m;
                                                        break;
                                                    case 157:
                                                        UserSession userSession21 = this.mAppContext;
                                                        C14360o3.A06(userSession21);
                                                        c47162Ei = C66Z.A00(userSession21).A0n;
                                                        break;
                                                    case 162:
                                                        UserSession userSession22 = this.mAppContext;
                                                        C14360o3.A06(userSession22);
                                                        c47162Ei = C66Z.A00(userSession22).A0o;
                                                        break;
                                                    case 164:
                                                        UserSession userSession23 = this.mAppContext;
                                                        C14360o3.A06(userSession23);
                                                        c47162Ei = C66Z.A00(userSession23).A0p;
                                                        break;
                                                    case 165:
                                                        UserSession userSession24 = this.mAppContext;
                                                        C14360o3.A06(userSession24);
                                                        c47162Ei = C66Z.A00(userSession24).A0q;
                                                        break;
                                                    case 168:
                                                        UserSession userSession25 = this.mAppContext;
                                                        C14360o3.A06(userSession25);
                                                        c47162Ei = C66Z.A00(userSession25).A0r;
                                                        break;
                                                    case AbstractC62862SUj.MAX_FACTORIAL /* 170 */:
                                                        UserSession userSession26 = this.mAppContext;
                                                        C14360o3.A06(userSession26);
                                                        c47162Ei = C66Z.A00(userSession26).A0s;
                                                        break;
                                                    case 186:
                                                        UserSession userSession27 = this.mAppContext;
                                                        C14360o3.A06(userSession27);
                                                        c47162Ei = C66Z.A00(userSession27).A0t;
                                                        break;
                                                    case 189:
                                                        UserSession userSession28 = this.mAppContext;
                                                        C14360o3.A06(userSession28);
                                                        c47162Ei = C66Z.A00(userSession28).A0u;
                                                        break;
                                                    case 191:
                                                        UserSession userSession29 = this.mAppContext;
                                                        C14360o3.A06(userSession29);
                                                        c47162Ei = C66Z.A00(userSession29).A0v;
                                                        break;
                                                    case 196:
                                                        UserSession userSession30 = this.mAppContext;
                                                        C14360o3.A06(userSession30);
                                                        c47162Ei = C66Z.A00(userSession30).A0w;
                                                        break;
                                                    case 199:
                                                        UserSession userSession31 = this.mAppContext;
                                                        C14360o3.A06(userSession31);
                                                        c47162Ei = C66Z.A00(userSession31).A0x;
                                                        break;
                                                    case 209:
                                                        UserSession userSession32 = this.mAppContext;
                                                        C14360o3.A06(userSession32);
                                                        c47162Ei = C66Z.A00(userSession32).A0z;
                                                        break;
                                                    case 211:
                                                        UserSession userSession33 = this.mAppContext;
                                                        C14360o3.A06(userSession33);
                                                        c47162Ei = C66Z.A00(userSession33).A10;
                                                        break;
                                                    case 212:
                                                        UserSession userSession34 = this.mAppContext;
                                                        C14360o3.A06(userSession34);
                                                        c47162Ei = C66Z.A00(userSession34).A11;
                                                        break;
                                                    case 213:
                                                        UserSession userSession35 = this.mAppContext;
                                                        C14360o3.A06(userSession35);
                                                        c47162Ei = C66Z.A00(userSession35).A12;
                                                        break;
                                                    case 218:
                                                        UserSession userSession36 = this.mAppContext;
                                                        C14360o3.A06(userSession36);
                                                        c47162Ei = C66Z.A00(userSession36).A13;
                                                        break;
                                                    case 223:
                                                        UserSession userSession37 = this.mAppContext;
                                                        C14360o3.A06(userSession37);
                                                        c47162Ei = C66Z.A00(userSession37).A14;
                                                        break;
                                                    case 228:
                                                        UserSession userSession38 = this.mAppContext;
                                                        C14360o3.A06(userSession38);
                                                        c47162Ei = C66Z.A00(userSession38).A15;
                                                        break;
                                                    case 233:
                                                        UserSession userSession39 = this.mAppContext;
                                                        C14360o3.A06(userSession39);
                                                        c47162Ei = C66Z.A00(userSession39).A16;
                                                        break;
                                                    case 236:
                                                        UserSession userSession40 = this.mAppContext;
                                                        C14360o3.A06(userSession40);
                                                        c47162Ei = C66Z.A00(userSession40).A17;
                                                        break;
                                                    case 237:
                                                        UserSession userSession41 = this.mAppContext;
                                                        C14360o3.A06(userSession41);
                                                        c47162Ei = C66Z.A00(userSession41).A18;
                                                        break;
                                                    case 241:
                                                        UserSession userSession42 = this.mAppContext;
                                                        C14360o3.A06(userSession42);
                                                        c47162Ei = C66Z.A00(userSession42).A19;
                                                        break;
                                                    case 242:
                                                        UserSession userSession43 = this.mAppContext;
                                                        C14360o3.A06(userSession43);
                                                        c47162Ei = C66Z.A00(userSession43).A1A;
                                                        break;
                                                    case 243:
                                                        UserSession userSession44 = this.mAppContext;
                                                        C14360o3.A06(userSession44);
                                                        c47162Ei = C66Z.A00(userSession44).A1B;
                                                        break;
                                                    case 247:
                                                        UserSession userSession45 = this.mAppContext;
                                                        C14360o3.A06(userSession45);
                                                        c47162Ei = C66Z.A00(userSession45).A1C;
                                                        break;
                                                    case 248:
                                                        UserSession userSession46 = this.mAppContext;
                                                        C14360o3.A06(userSession46);
                                                        c47162Ei = C66Z.A00(userSession46).A1D;
                                                        break;
                                                    case C8S8.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                                                        UserSession userSession47 = this.mAppContext;
                                                        C14360o3.A06(userSession47);
                                                        c47162Ei = C66Z.A00(userSession47).A1E;
                                                        break;
                                                    case 251:
                                                        UserSession userSession48 = this.mAppContext;
                                                        C14360o3.A06(userSession48);
                                                        c47162Ei = C66Z.A00(userSession48).A1F;
                                                        break;
                                                    case 253:
                                                        UserSession userSession49 = this.mAppContext;
                                                        C14360o3.A06(userSession49);
                                                        c47162Ei = C66Z.A00(userSession49).A1G;
                                                        break;
                                                    case 259:
                                                        UserSession userSession50 = this.mAppContext;
                                                        C14360o3.A06(userSession50);
                                                        c47162Ei = C66Z.A00(userSession50).A1H;
                                                        break;
                                                    case 260:
                                                        UserSession userSession51 = this.mAppContext;
                                                        C14360o3.A06(userSession51);
                                                        c47162Ei = C66Z.A00(userSession51).A1I;
                                                        break;
                                                    case 261:
                                                        UserSession userSession52 = this.mAppContext;
                                                        C14360o3.A06(userSession52);
                                                        c47162Ei = C66Z.A00(userSession52).A1J;
                                                        break;
                                                    case 263:
                                                        UserSession userSession53 = this.mAppContext;
                                                        C14360o3.A06(userSession53);
                                                        c47162Ei = C66Z.A00(userSession53).A1K;
                                                        break;
                                                    case 264:
                                                        UserSession userSession54 = this.mAppContext;
                                                        C14360o3.A06(userSession54);
                                                        c47162Ei = C66Z.A00(userSession54).A1L;
                                                        break;
                                                    case 268:
                                                        UserSession userSession55 = this.mAppContext;
                                                        C14360o3.A06(userSession55);
                                                        c47162Ei = C66Z.A00(userSession55).A1M;
                                                        break;
                                                    case 269:
                                                        UserSession userSession56 = this.mAppContext;
                                                        C14360o3.A06(userSession56);
                                                        c47162Ei = C66Z.A00(userSession56).A1N;
                                                        break;
                                                    case 273:
                                                        UserSession userSession57 = this.mAppContext;
                                                        C14360o3.A06(userSession57);
                                                        c47162Ei = C66Z.A00(userSession57).A1O;
                                                        break;
                                                    case 277:
                                                        UserSession userSession58 = this.mAppContext;
                                                        C14360o3.A06(userSession58);
                                                        c47162Ei = C66Z.A00(userSession58).A1P;
                                                        break;
                                                    case 289:
                                                        UserSession userSession59 = this.mAppContext;
                                                        C14360o3.A06(userSession59);
                                                        c47162Ei = C66Z.A00(userSession59).A1Q;
                                                        break;
                                                    case 291:
                                                        UserSession userSession60 = this.mAppContext;
                                                        C14360o3.A06(userSession60);
                                                        c47162Ei = C66Z.A00(userSession60).A1R;
                                                        break;
                                                    case 292:
                                                        UserSession userSession61 = this.mAppContext;
                                                        C14360o3.A06(userSession61);
                                                        c47162Ei = C66Z.A00(userSession61).A1S;
                                                        break;
                                                    case 293:
                                                        UserSession userSession62 = this.mAppContext;
                                                        C14360o3.A06(userSession62);
                                                        c47162Ei = C66Z.A00(userSession62).A1V;
                                                        break;
                                                    case 294:
                                                        UserSession userSession63 = this.mAppContext;
                                                        C14360o3.A06(userSession63);
                                                        c47162Ei = C66Z.A00(userSession63).A1X;
                                                        break;
                                                    case 295:
                                                        UserSession userSession64 = this.mAppContext;
                                                        C14360o3.A06(userSession64);
                                                        c47162Ei = C66Z.A00(userSession64).A1Z;
                                                        break;
                                                    case 296:
                                                        UserSession userSession65 = this.mAppContext;
                                                        C14360o3.A06(userSession65);
                                                        c47162Ei = C66Z.A00(userSession65).A1a;
                                                        break;
                                                    case 297:
                                                        UserSession userSession66 = this.mAppContext;
                                                        C14360o3.A06(userSession66);
                                                        c47162Ei = C66Z.A00(userSession66).A1b;
                                                        break;
                                                    case 298:
                                                        UserSession userSession67 = this.mAppContext;
                                                        C14360o3.A06(userSession67);
                                                        c47162Ei = C66Z.A00(userSession67).A1c;
                                                        break;
                                                    case 299:
                                                        UserSession userSession68 = this.mAppContext;
                                                        C14360o3.A06(userSession68);
                                                        c47162Ei = C66Z.A00(userSession68).A1d;
                                                        break;
                                                    case DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD /* 300 */:
                                                        UserSession userSession69 = this.mAppContext;
                                                        C14360o3.A06(userSession69);
                                                        c47162Ei = C66Z.A00(userSession69).A1e;
                                                        break;
                                                    case 301:
                                                        UserSession userSession70 = this.mAppContext;
                                                        C14360o3.A06(userSession70);
                                                        c47162Ei = C66Z.A00(userSession70).A1f;
                                                        break;
                                                    case 302:
                                                        UserSession userSession71 = this.mAppContext;
                                                        C14360o3.A06(userSession71);
                                                        c47162Ei = C66Z.A00(userSession71).A1g;
                                                        break;
                                                    case 303:
                                                        UserSession userSession72 = this.mAppContext;
                                                        C14360o3.A06(userSession72);
                                                        c47162Ei = C66Z.A00(userSession72).A1h;
                                                        break;
                                                    case 304:
                                                        UserSession userSession73 = this.mAppContext;
                                                        C14360o3.A06(userSession73);
                                                        c47162Ei = C66Z.A00(userSession73).A1i;
                                                        break;
                                                    case 309:
                                                        UserSession userSession74 = this.mAppContext;
                                                        C14360o3.A06(userSession74);
                                                        c47162Ei = C66Z.A00(userSession74).A1j;
                                                        break;
                                                    case 310:
                                                        UserSession userSession75 = this.mAppContext;
                                                        C14360o3.A06(userSession75);
                                                        c47162Ei = C66Z.A00(userSession75).A1k;
                                                        break;
                                                    case 311:
                                                        UserSession userSession76 = this.mAppContext;
                                                        C14360o3.A06(userSession76);
                                                        c47162Ei = C66Z.A00(userSession76).A1l;
                                                        break;
                                                    case 312:
                                                        UserSession userSession77 = this.mAppContext;
                                                        C14360o3.A06(userSession77);
                                                        c47162Ei = C66Z.A00(userSession77).A1m;
                                                        break;
                                                    case 313:
                                                        UserSession userSession78 = this.mAppContext;
                                                        C14360o3.A06(userSession78);
                                                        c47162Ei = C66Z.A00(userSession78).A1n;
                                                        break;
                                                    case 314:
                                                        UserSession userSession79 = this.mAppContext;
                                                        C14360o3.A06(userSession79);
                                                        c47162Ei = C66Z.A00(userSession79).A1o;
                                                        break;
                                                    case 315:
                                                        UserSession userSession80 = this.mAppContext;
                                                        C14360o3.A06(userSession80);
                                                        c47162Ei = C66Z.A00(userSession80).A1q;
                                                        break;
                                                    case 316:
                                                        UserSession userSession81 = this.mAppContext;
                                                        C14360o3.A06(userSession81);
                                                        c47162Ei = C66Z.A00(userSession81).A1r;
                                                        break;
                                                    case 317:
                                                        UserSession userSession82 = this.mAppContext;
                                                        C14360o3.A06(userSession82);
                                                        c47162Ei = C66Z.A00(userSession82).A1s;
                                                        break;
                                                    case 318:
                                                        UserSession userSession83 = this.mAppContext;
                                                        C14360o3.A06(userSession83);
                                                        c47162Ei = C66Z.A00(userSession83).A1t;
                                                        break;
                                                    case 325:
                                                        UserSession userSession84 = this.mAppContext;
                                                        C14360o3.A06(userSession84);
                                                        c47162Ei = C66Z.A00(userSession84).A1u;
                                                        break;
                                                    case 337:
                                                        UserSession userSession85 = this.mAppContext;
                                                        C14360o3.A06(userSession85);
                                                        c47162Ei = C66Z.A00(userSession85).A1v;
                                                        break;
                                                    case 356:
                                                        UserSession userSession86 = this.mAppContext;
                                                        C14360o3.A06(userSession86);
                                                        c47162Ei = C66Z.A00(userSession86).A1z;
                                                        break;
                                                    case 382:
                                                        UserSession userSession87 = this.mAppContext;
                                                        C14360o3.A06(userSession87);
                                                        c47162Ei = C66Z.A00(userSession87).A24;
                                                        break;
                                                    case 387:
                                                        UserSession userSession88 = this.mAppContext;
                                                        C14360o3.A06(userSession88);
                                                        c47162Ei = C66Z.A00(userSession88).A26;
                                                        break;
                                                    case 390:
                                                        UserSession userSession89 = this.mAppContext;
                                                        C14360o3.A06(userSession89);
                                                        c47162Ei = C66Z.A00(userSession89).A27;
                                                        break;
                                                    case 392:
                                                        UserSession userSession90 = this.mAppContext;
                                                        C14360o3.A06(userSession90);
                                                        c47162Ei = C66Z.A00(userSession90).A29;
                                                        break;
                                                    case 412:
                                                        UserSession userSession91 = this.mAppContext;
                                                        C14360o3.A06(userSession91);
                                                        c47162Ei = C66Z.A00(userSession91).A2F;
                                                        break;
                                                    case 423:
                                                        UserSession userSession92 = this.mAppContext;
                                                        C14360o3.A06(userSession92);
                                                        c47162Ei = C66Z.A00(userSession92).A2L;
                                                        break;
                                                    case 426:
                                                        UserSession userSession93 = this.mAppContext;
                                                        C14360o3.A06(userSession93);
                                                        c47162Ei = C66Z.A00(userSession93).A2M;
                                                        break;
                                                    case 427:
                                                        UserSession userSession94 = this.mAppContext;
                                                        C14360o3.A06(userSession94);
                                                        c47162Ei = C66Z.A00(userSession94).A2N;
                                                        break;
                                                    case 428:
                                                        UserSession userSession95 = this.mAppContext;
                                                        C14360o3.A06(userSession95);
                                                        c47162Ei = C66Z.A00(userSession95).A2P;
                                                        break;
                                                    case 436:
                                                        UserSession userSession96 = this.mAppContext;
                                                        C14360o3.A06(userSession96);
                                                        c47162Ei = C66Z.A00(userSession96).A2Q;
                                                        break;
                                                    case 437:
                                                        UserSession userSession97 = this.mAppContext;
                                                        C14360o3.A06(userSession97);
                                                        c47162Ei = C66Z.A00(userSession97).A2S;
                                                        break;
                                                    case 438:
                                                        UserSession userSession98 = this.mAppContext;
                                                        C14360o3.A06(userSession98);
                                                        c47162Ei = C66Z.A00(userSession98).A2R;
                                                        break;
                                                    case 441:
                                                        UserSession userSession99 = this.mAppContext;
                                                        C14360o3.A06(userSession99);
                                                        c47162Ei = C66Z.A00(userSession99).A2T;
                                                        break;
                                                    case 444:
                                                        UserSession userSession100 = this.mAppContext;
                                                        C14360o3.A06(userSession100);
                                                        c47162Ei = C66Z.A00(userSession100).A2U;
                                                        break;
                                                    case 446:
                                                        UserSession userSession101 = this.mAppContext;
                                                        C14360o3.A06(userSession101);
                                                        c47162Ei = C66Z.A00(userSession101).A2V;
                                                        break;
                                                    case 447:
                                                        UserSession userSession102 = this.mAppContext;
                                                        C14360o3.A06(userSession102);
                                                        c47162Ei = C66Z.A00(userSession102).A2X;
                                                        break;
                                                    case 448:
                                                        UserSession userSession103 = this.mAppContext;
                                                        C14360o3.A06(userSession103);
                                                        c47162Ei = C66Z.A00(userSession103).A2Y;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 95:
                                                                UserSession userSession104 = this.mAppContext;
                                                                C14360o3.A06(userSession104);
                                                                c47162Ei = C66Z.A00(userSession104).A0O;
                                                                break;
                                                            case 96:
                                                            case 98:
                                                                return false;
                                                            case 97:
                                                                UserSession userSession105 = this.mAppContext;
                                                                C14360o3.A06(userSession105);
                                                                c47162Ei = C66Z.A00(userSession105).A0P;
                                                                break;
                                                            case 99:
                                                                UserSession userSession106 = this.mAppContext;
                                                                C14360o3.A06(userSession106);
                                                                c47162Ei = C66Z.A00(userSession106).A0Q;
                                                                break;
                                                            case 100:
                                                                UserSession userSession107 = this.mAppContext;
                                                                C14360o3.A06(userSession107);
                                                                c47162Ei = C66Z.A00(userSession107).A0R;
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 122:
                                                                        UserSession userSession108 = this.mAppContext;
                                                                        C14360o3.A06(userSession108);
                                                                        c47162Ei = C66Z.A00(userSession108).A0Y;
                                                                        break;
                                                                    case 123:
                                                                        UserSession userSession109 = this.mAppContext;
                                                                        C14360o3.A06(userSession109);
                                                                        c47162Ei = C66Z.A00(userSession109).A0Z;
                                                                        break;
                                                                    case 124:
                                                                        UserSession userSession110 = this.mAppContext;
                                                                        C14360o3.A06(userSession110);
                                                                        c47162Ei = C66Z.A00(userSession110).A0a;
                                                                        break;
                                                                    case 125:
                                                                        UserSession userSession111 = this.mAppContext;
                                                                        C14360o3.A06(userSession111);
                                                                        c47162Ei = C66Z.A00(userSession111).A0b;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 136:
                                                                                UserSession userSession112 = this.mAppContext;
                                                                                C14360o3.A06(userSession112);
                                                                                c47162Ei = C66Z.A00(userSession112).A0c;
                                                                                break;
                                                                            case 137:
                                                                                UserSession userSession113 = this.mAppContext;
                                                                                C14360o3.A06(userSession113);
                                                                                c47162Ei = C66Z.A00(userSession113).A0d;
                                                                                break;
                                                                            case 138:
                                                                                UserSession userSession114 = this.mAppContext;
                                                                                C14360o3.A06(userSession114);
                                                                                c47162Ei = C66Z.A00(userSession114).A0e;
                                                                                break;
                                                                            case 139:
                                                                                UserSession userSession115 = this.mAppContext;
                                                                                C14360o3.A06(userSession115);
                                                                                c47162Ei = C66Z.A00(userSession115).A0f;
                                                                                break;
                                                                            case 140:
                                                                                UserSession userSession116 = this.mAppContext;
                                                                                C14360o3.A06(userSession116);
                                                                                c47162Ei = C66Z.A00(userSession116).A0g;
                                                                                break;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 142:
                                                                                    case 144:
                                                                                        return false;
                                                                                    case 143:
                                                                                        UserSession userSession117 = this.mAppContext;
                                                                                        C14360o3.A06(userSession117);
                                                                                        c47162Ei = C66Z.A00(userSession117).A0h;
                                                                                        break;
                                                                                    default:
                                                                                        return z;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else {
                                                UserSession userSession118 = this.mAppContext;
                                                C14360o3.A06(userSession118);
                                                c47162Ei = C66Z.A00(userSession118).A0W;
                                            }
                                        } else {
                                            UserSession userSession119 = this.mAppContext;
                                            C14360o3.A06(userSession119);
                                            c47162Ei = C66Z.A00(userSession119).A0V;
                                        }
                                    } else {
                                        return true;
                                    }
                                } else {
                                    UserSession userSession120 = this.mAppContext;
                                    C14360o3.A06(userSession120);
                                    c47162Ei = C66Z.A00(userSession120).A0S;
                                }
                            } else {
                                UserSession userSession121 = this.mAppContext;
                                C14360o3.A06(userSession121);
                                c47162Ei = C66Z.A00(userSession121).A0F;
                            }
                        } else {
                            UserSession userSession122 = this.mAppContext;
                            C14360o3.A06(userSession122);
                            c47162Ei = C66Z.A00(userSession122).A0E;
                        }
                    } else {
                        UserSession userSession123 = this.mAppContext;
                        C14360o3.A06(userSession123);
                        c47162Ei = C66Z.A00(userSession123).A0C;
                    }
                } else {
                    UserSession userSession124 = this.mAppContext;
                    C14360o3.A06(userSession124);
                    c47162Ei = C66Z.A00(userSession124).A0B;
                }
            } else {
                return false;
            }
        } else {
            UserSession userSession125 = this.mAppContext;
            C14360o3.A06(userSession125);
            c47162Ei = C66Z.A00(userSession125).A09;
        }
        if (z2) {
            A00 = c47162Ei.get();
        } else {
            A00 = c47162Ei.A00();
        }
        return ((Boolean) A00).booleanValue();
    }

    @Override // com.instagram.direct.msys.mailbox.armadillo.mobileconfig.Premailbox
    public double MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetDouble(int i, double d, boolean z) {
        C47162Ei c47162Ei;
        Object A00;
        if (i != 449) {
            if (i == 456) {
                UserSession userSession = this.mAppContext;
                C14360o3.A06(userSession);
                c47162Ei = C66Z.A00(userSession).A2G;
            } else {
                return d;
            }
        } else {
            UserSession userSession2 = this.mAppContext;
            C14360o3.A06(userSession2);
            c47162Ei = C66Z.A00(userSession2).A1y;
        }
        if (z) {
            A00 = c47162Ei.get();
        } else {
            A00 = c47162Ei.A00();
        }
        return ((Number) A00).doubleValue();
    }

    @Override // com.instagram.direct.msys.mailbox.armadillo.mobileconfig.Premailbox
    public int MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt32(int i, int i2, boolean z) {
        C47162Ei c47162Ei;
        Object A00;
        if (i != 463) {
            if (i != 464) {
                if (i != 467) {
                    if (i != 468) {
                        switch (i) {
                            case 471:
                                UserSession userSession = this.mAppContext;
                                C14360o3.A06(userSession);
                                c47162Ei = C66Z.A00(userSession).A06;
                                break;
                            case 484:
                                UserSession userSession2 = this.mAppContext;
                                C14360o3.A06(userSession2);
                                c47162Ei = C66Z.A00(userSession2).A07;
                                break;
                            case 489:
                                UserSession userSession3 = this.mAppContext;
                                C14360o3.A06(userSession3);
                                c47162Ei = C66Z.A00(userSession3).A0A;
                                break;
                            case 497:
                                UserSession userSession4 = this.mAppContext;
                                C14360o3.A06(userSession4);
                                c47162Ei = C66Z.A00(userSession4).A0G;
                                break;
                            case 511:
                                UserSession userSession5 = this.mAppContext;
                                C14360o3.A06(userSession5);
                                c47162Ei = C66Z.A00(userSession5).A1x;
                                break;
                            case 521:
                                return 0;
                            case 530:
                                UserSession userSession6 = this.mAppContext;
                                C14360o3.A06(userSession6);
                                c47162Ei = C66Z.A00(userSession6).A25;
                                break;
                            case 532:
                                UserSession userSession7 = this.mAppContext;
                                C14360o3.A06(userSession7);
                                c47162Ei = C66Z.A00(userSession7).A28;
                                break;
                            case 541:
                                UserSession userSession8 = this.mAppContext;
                                C14360o3.A06(userSession8);
                                c47162Ei = C66Z.A00(userSession8).A2E;
                                break;
                            case 544:
                                UserSession userSession9 = this.mAppContext;
                                C14360o3.A06(userSession9);
                                c47162Ei = C66Z.A00(userSession9).A2H;
                                break;
                            case 553:
                                UserSession userSession10 = this.mAppContext;
                                C14360o3.A06(userSession10);
                                c47162Ei = C66Z.A00(userSession10).A2W;
                                break;
                            default:
                                switch (i) {
                                    case 502:
                                        UserSession userSession11 = this.mAppContext;
                                        C14360o3.A06(userSession11);
                                        c47162Ei = C66Z.A00(userSession11).A1T;
                                        break;
                                    case 503:
                                        UserSession userSession12 = this.mAppContext;
                                        C14360o3.A06(userSession12);
                                        c47162Ei = C66Z.A00(userSession12).A1U;
                                        break;
                                    case 504:
                                        UserSession userSession13 = this.mAppContext;
                                        C14360o3.A06(userSession13);
                                        c47162Ei = C66Z.A00(userSession13).A1Y;
                                        break;
                                    default:
                                        switch (i) {
                                            case 523:
                                                UserSession userSession14 = this.mAppContext;
                                                C14360o3.A06(userSession14);
                                                c47162Ei = C66Z.A00(userSession14).A20;
                                                break;
                                            case 524:
                                                UserSession userSession15 = this.mAppContext;
                                                C14360o3.A06(userSession15);
                                                c47162Ei = C66Z.A00(userSession15).A21;
                                                break;
                                            case 525:
                                                UserSession userSession16 = this.mAppContext;
                                                C14360o3.A06(userSession16);
                                                c47162Ei = C66Z.A00(userSession16).A22;
                                                break;
                                            case 526:
                                                UserSession userSession17 = this.mAppContext;
                                                C14360o3.A06(userSession17);
                                                c47162Ei = C66Z.A00(userSession17).A23;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 535:
                                                        UserSession userSession18 = this.mAppContext;
                                                        C14360o3.A06(userSession18);
                                                        c47162Ei = C66Z.A00(userSession18).A2A;
                                                        break;
                                                    case 536:
                                                        UserSession userSession19 = this.mAppContext;
                                                        C14360o3.A06(userSession19);
                                                        c47162Ei = C66Z.A00(userSession19).A2B;
                                                        break;
                                                    case 537:
                                                        UserSession userSession20 = this.mAppContext;
                                                        C14360o3.A06(userSession20);
                                                        c47162Ei = C66Z.A00(userSession20).A2C;
                                                        break;
                                                    case 538:
                                                        UserSession userSession21 = this.mAppContext;
                                                        C14360o3.A06(userSession21);
                                                        c47162Ei = C66Z.A00(userSession21).A2D;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 546:
                                                                UserSession userSession22 = this.mAppContext;
                                                                C14360o3.A06(userSession22);
                                                                c47162Ei = C66Z.A00(userSession22).A2I;
                                                                break;
                                                            case 547:
                                                                UserSession userSession23 = this.mAppContext;
                                                                C14360o3.A06(userSession23);
                                                                c47162Ei = C66Z.A00(userSession23).A2J;
                                                                break;
                                                            case 548:
                                                                UserSession userSession24 = this.mAppContext;
                                                                C14360o3.A06(userSession24);
                                                                c47162Ei = C66Z.A00(userSession24).A2K;
                                                                break;
                                                            case 549:
                                                                UserSession userSession25 = this.mAppContext;
                                                                C14360o3.A06(userSession25);
                                                                c47162Ei = C66Z.A00(userSession25).A2O;
                                                                break;
                                                            case 550:
                                                                return 1;
                                                            default:
                                                                return i2;
                                                        }
                                                }
                                        }
                                }
                        }
                    } else {
                        UserSession userSession26 = this.mAppContext;
                        C14360o3.A06(userSession26);
                        c47162Ei = C66Z.A00(userSession26).A05;
                    }
                } else {
                    return 16;
                }
            } else {
                UserSession userSession27 = this.mAppContext;
                C14360o3.A06(userSession27);
                c47162Ei = C66Z.A00(userSession27).A03;
            }
        } else {
            UserSession userSession28 = this.mAppContext;
            C14360o3.A06(userSession28);
            c47162Ei = C66Z.A00(userSession28).A02;
        }
        if (z) {
            A00 = c47162Ei.get();
        } else {
            A00 = c47162Ei.A00();
        }
        return (int) ((Number) A00).longValue();
    }

    @Override // com.instagram.direct.msys.mailbox.armadillo.mobileconfig.Premailbox
    public long MEMMobileConfigPlatformIgdAndroidImpl_MEMMobileConfigPlatformGetInt64(int i, long j, boolean z) {
        C47162Ei c47162Ei;
        Object A00;
        if (i != 556) {
            if (i == 557) {
                UserSession userSession = this.mAppContext;
                C14360o3.A06(userSession);
                c47162Ei = C66Z.A00(userSession).A1W;
            } else {
                return j;
            }
        } else {
            UserSession userSession2 = this.mAppContext;
            C14360o3.A06(userSession2);
            c47162Ei = C66Z.A00(userSession2).A0y;
        }
        if (z) {
            A00 = c47162Ei.get();
        } else {
            A00 = c47162Ei.A00();
        }
        return ((Number) A00).longValue();
    }

    public MEMMobileConfigPlatformIgdAndroidPluginPremailbox(UserSession userSession) {
        super(userSession);
    }
}
