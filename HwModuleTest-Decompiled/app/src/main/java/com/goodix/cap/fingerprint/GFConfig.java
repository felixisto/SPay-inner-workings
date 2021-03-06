package com.goodix.cap.fingerprint;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.goodix.cap.fingerprint.utils.TestResultParser;

public class GFConfig implements Parcelable {
    public static final Creator<GFConfig> CREATOR = new Creator<GFConfig>() {
        public GFConfig createFromParcel(Parcel in) {
            return new GFConfig(in);
        }

        public GFConfig[] newArray(int size) {
            return new GFConfig[size];
        }
    };
    public int mAuthenticateOrder;
    public int mBadPointTestMaxFrameNumber;
    public int mBrokenPixelThresholdForDisableSensor;
    public int mBrokenPixelThresholdForDisableStudy;
    public int mChipSeries;
    public int mChipType;
    public int mDuplicateFingerOverlayScore;
    public int mEnrollingMinTemplates;
    public int mForbiddenEnrollDuplicateFingers;
    public int mForbiddenUntrustedEnroll;
    public int mImageQualityThresholdForMistakeTouch;
    public int mIncreaseRateBetweenStitchInfo;
    public int mMaxFingers;
    public int mMaxFingersPerUser;
    public int mNavDoubleClickTime;
    public int mNavLongPressTime;
    public int mReissueKeyDownWhenEntryFfMode;
    public int mReissueKeyDownWhenEntryImageMode;
    public int mReportKeyEventOnlyEnrollAuthenticate;
    public int mRequireDownAndUpInPairsForFFMode;
    public int mRequireDownAndUpInPairsForImageMode;
    public int mRequireDownAndUpInPairsForKeyMode;
    public int mRequireDownAndUpInPairsForNavMode;
    public int mRescanImageAreaThreshold;
    public int mRescanImageQualityThreshold;
    public int mRescanRetryCount;
    public int mScreenOffAuthenticateFailRetryCount;
    public int mScreenOffValidTouchFrameThreshold;
    public int mScreenOnAuthenticateFailRetryCount;
    public int mScreenOnValidTouchFrameThreshold;
    public int mSupportBioAssay;
    public int mSupportFFMode;
    public int mSupportFrrAnalysis;
    public int mSupportImageRescan;
    public int mSupportKeyMode;
    public int mSupportNavMode;
    public int mSupportPerformanceDump;
    public int mSupportPowerKeyFeature;
    public int mSupportSensorBrokenCheck;
    public int mSupportSetSpiSpeedInTEE;
    public int mTemplateUpateSaveThreshold;
    public int mValidImageAreaThreshold;
    public int mValidImageQualityThreshold;

    public GFConfig() {
        this.mChipType = 24;
        this.mChipSeries = 4;
        this.mMaxFingers = 32;
        this.mMaxFingersPerUser = 5;
        this.mSupportKeyMode = 0;
        this.mSupportFFMode = 1;
        this.mSupportPowerKeyFeature = 0;
        this.mForbiddenUntrustedEnroll = 0;
        this.mForbiddenEnrollDuplicateFingers = 0;
        this.mSupportBioAssay = 0;
        this.mSupportPerformanceDump = 0;
        this.mSupportNavMode = 0;
        this.mNavDoubleClickTime = 0;
        this.mNavLongPressTime = 0;
        this.mEnrollingMinTemplates = 8;
        this.mValidImageQualityThreshold = 15;
        this.mValidImageAreaThreshold = 65;
        this.mDuplicateFingerOverlayScore = 70;
        this.mIncreaseRateBetweenStitchInfo = 15;
        this.mSupportImageRescan = 1;
        this.mRescanImageQualityThreshold = 10;
        this.mRescanImageAreaThreshold = 60;
        this.mRescanRetryCount = 1;
        this.mScreenOnAuthenticateFailRetryCount = 1;
        this.mScreenOffAuthenticateFailRetryCount = 1;
        this.mScreenOnValidTouchFrameThreshold = 1;
        this.mScreenOffValidTouchFrameThreshold = 1;
        this.mImageQualityThresholdForMistakeTouch = 10;
        this.mAuthenticateOrder = 0;
        this.mReissueKeyDownWhenEntryFfMode = 0;
        this.mReissueKeyDownWhenEntryImageMode = 1;
        this.mSupportSensorBrokenCheck = 0;
        this.mBrokenPixelThresholdForDisableSensor = TestResultParser.TEST_TOKEN_RESET_FLAG;
        this.mBrokenPixelThresholdForDisableStudy = TestResultParser.TEST_TOKEN_AVG_DIFF_VAL;
        this.mBadPointTestMaxFrameNumber = 2;
        this.mReportKeyEventOnlyEnrollAuthenticate = 0;
        this.mRequireDownAndUpInPairsForImageMode = 1;
        this.mRequireDownAndUpInPairsForFFMode = 0;
        this.mRequireDownAndUpInPairsForKeyMode = 1;
        this.mRequireDownAndUpInPairsForNavMode = 1;
        this.mSupportSetSpiSpeedInTEE = 1;
        this.mSupportFrrAnalysis = 1;
        this.mTemplateUpateSaveThreshold = 20;
    }

    private GFConfig(Parcel in) {
        this.mChipType = 24;
        this.mChipSeries = 4;
        this.mMaxFingers = 32;
        this.mMaxFingersPerUser = 5;
        this.mSupportKeyMode = 0;
        this.mSupportFFMode = 1;
        this.mSupportPowerKeyFeature = 0;
        this.mForbiddenUntrustedEnroll = 0;
        this.mForbiddenEnrollDuplicateFingers = 0;
        this.mSupportBioAssay = 0;
        this.mSupportPerformanceDump = 0;
        this.mSupportNavMode = 0;
        this.mNavDoubleClickTime = 0;
        this.mNavLongPressTime = 0;
        this.mEnrollingMinTemplates = 8;
        this.mValidImageQualityThreshold = 15;
        this.mValidImageAreaThreshold = 65;
        this.mDuplicateFingerOverlayScore = 70;
        this.mIncreaseRateBetweenStitchInfo = 15;
        this.mSupportImageRescan = 1;
        this.mRescanImageQualityThreshold = 10;
        this.mRescanImageAreaThreshold = 60;
        this.mRescanRetryCount = 1;
        this.mScreenOnAuthenticateFailRetryCount = 1;
        this.mScreenOffAuthenticateFailRetryCount = 1;
        this.mScreenOnValidTouchFrameThreshold = 1;
        this.mScreenOffValidTouchFrameThreshold = 1;
        this.mImageQualityThresholdForMistakeTouch = 10;
        this.mAuthenticateOrder = 0;
        this.mReissueKeyDownWhenEntryFfMode = 0;
        this.mReissueKeyDownWhenEntryImageMode = 1;
        this.mSupportSensorBrokenCheck = 0;
        this.mBrokenPixelThresholdForDisableSensor = TestResultParser.TEST_TOKEN_RESET_FLAG;
        this.mBrokenPixelThresholdForDisableStudy = TestResultParser.TEST_TOKEN_AVG_DIFF_VAL;
        this.mBadPointTestMaxFrameNumber = 2;
        this.mReportKeyEventOnlyEnrollAuthenticate = 0;
        this.mRequireDownAndUpInPairsForImageMode = 1;
        this.mRequireDownAndUpInPairsForFFMode = 0;
        this.mRequireDownAndUpInPairsForKeyMode = 1;
        this.mRequireDownAndUpInPairsForNavMode = 1;
        this.mSupportSetSpiSpeedInTEE = 1;
        this.mSupportFrrAnalysis = 1;
        this.mTemplateUpateSaveThreshold = 20;
        this.mChipType = in.readInt();
        this.mChipSeries = in.readInt();
        this.mMaxFingers = in.readInt();
        this.mMaxFingersPerUser = in.readInt();
        this.mSupportKeyMode = in.readInt();
        this.mSupportFFMode = in.readInt();
        this.mSupportPowerKeyFeature = in.readInt();
        this.mForbiddenUntrustedEnroll = in.readInt();
        this.mForbiddenEnrollDuplicateFingers = in.readInt();
        this.mSupportBioAssay = in.readInt();
        this.mSupportPerformanceDump = in.readInt();
        this.mSupportNavMode = in.readInt();
        this.mNavDoubleClickTime = in.readInt();
        this.mNavLongPressTime = in.readInt();
        this.mEnrollingMinTemplates = in.readInt();
        this.mValidImageQualityThreshold = in.readInt();
        this.mValidImageAreaThreshold = in.readInt();
        this.mDuplicateFingerOverlayScore = in.readInt();
        this.mIncreaseRateBetweenStitchInfo = in.readInt();
        this.mSupportImageRescan = in.readInt();
        this.mRescanImageQualityThreshold = in.readInt();
        this.mRescanImageAreaThreshold = in.readInt();
        this.mRescanRetryCount = in.readInt();
        this.mScreenOnAuthenticateFailRetryCount = in.readInt();
        this.mScreenOffAuthenticateFailRetryCount = in.readInt();
        this.mScreenOnValidTouchFrameThreshold = in.readInt();
        this.mScreenOffValidTouchFrameThreshold = in.readInt();
        this.mImageQualityThresholdForMistakeTouch = in.readInt();
        this.mAuthenticateOrder = in.readInt();
        this.mReissueKeyDownWhenEntryFfMode = in.readInt();
        this.mReissueKeyDownWhenEntryImageMode = in.readInt();
        this.mSupportSensorBrokenCheck = in.readInt();
        this.mBrokenPixelThresholdForDisableSensor = in.readInt();
        this.mBrokenPixelThresholdForDisableStudy = in.readInt();
        this.mBadPointTestMaxFrameNumber = in.readInt();
        this.mReportKeyEventOnlyEnrollAuthenticate = in.readInt();
        this.mRequireDownAndUpInPairsForImageMode = in.readInt();
        this.mRequireDownAndUpInPairsForFFMode = in.readInt();
        this.mRequireDownAndUpInPairsForKeyMode = in.readInt();
        this.mRequireDownAndUpInPairsForNavMode = in.readInt();
        this.mSupportSetSpiSpeedInTEE = in.readInt();
        this.mSupportFrrAnalysis = in.readInt();
        this.mTemplateUpateSaveThreshold = in.readInt();
    }

    public GFConfig(GFConfig config) {
        this.mChipType = 24;
        this.mChipSeries = 4;
        this.mMaxFingers = 32;
        this.mMaxFingersPerUser = 5;
        this.mSupportKeyMode = 0;
        this.mSupportFFMode = 1;
        this.mSupportPowerKeyFeature = 0;
        this.mForbiddenUntrustedEnroll = 0;
        this.mForbiddenEnrollDuplicateFingers = 0;
        this.mSupportBioAssay = 0;
        this.mSupportPerformanceDump = 0;
        this.mSupportNavMode = 0;
        this.mNavDoubleClickTime = 0;
        this.mNavLongPressTime = 0;
        this.mEnrollingMinTemplates = 8;
        this.mValidImageQualityThreshold = 15;
        this.mValidImageAreaThreshold = 65;
        this.mDuplicateFingerOverlayScore = 70;
        this.mIncreaseRateBetweenStitchInfo = 15;
        this.mSupportImageRescan = 1;
        this.mRescanImageQualityThreshold = 10;
        this.mRescanImageAreaThreshold = 60;
        this.mRescanRetryCount = 1;
        this.mScreenOnAuthenticateFailRetryCount = 1;
        this.mScreenOffAuthenticateFailRetryCount = 1;
        this.mScreenOnValidTouchFrameThreshold = 1;
        this.mScreenOffValidTouchFrameThreshold = 1;
        this.mImageQualityThresholdForMistakeTouch = 10;
        this.mAuthenticateOrder = 0;
        this.mReissueKeyDownWhenEntryFfMode = 0;
        this.mReissueKeyDownWhenEntryImageMode = 1;
        this.mSupportSensorBrokenCheck = 0;
        this.mBrokenPixelThresholdForDisableSensor = TestResultParser.TEST_TOKEN_RESET_FLAG;
        this.mBrokenPixelThresholdForDisableStudy = TestResultParser.TEST_TOKEN_AVG_DIFF_VAL;
        this.mBadPointTestMaxFrameNumber = 2;
        this.mReportKeyEventOnlyEnrollAuthenticate = 0;
        this.mRequireDownAndUpInPairsForImageMode = 1;
        this.mRequireDownAndUpInPairsForFFMode = 0;
        this.mRequireDownAndUpInPairsForKeyMode = 1;
        this.mRequireDownAndUpInPairsForNavMode = 1;
        this.mSupportSetSpiSpeedInTEE = 1;
        this.mSupportFrrAnalysis = 1;
        this.mTemplateUpateSaveThreshold = 20;
        this.mChipType = config.mChipType;
        this.mChipSeries = config.mChipSeries;
        this.mMaxFingers = config.mMaxFingers;
        this.mMaxFingersPerUser = config.mMaxFingersPerUser;
        this.mSupportKeyMode = config.mSupportKeyMode;
        this.mSupportFFMode = config.mSupportFFMode;
        this.mSupportPowerKeyFeature = config.mSupportPowerKeyFeature;
        this.mForbiddenUntrustedEnroll = config.mForbiddenUntrustedEnroll;
        this.mForbiddenEnrollDuplicateFingers = config.mForbiddenEnrollDuplicateFingers;
        this.mSupportBioAssay = config.mSupportBioAssay;
        this.mSupportPerformanceDump = config.mSupportPerformanceDump;
        this.mSupportNavMode = config.mSupportNavMode;
        this.mNavDoubleClickTime = config.mNavDoubleClickTime;
        this.mNavLongPressTime = config.mNavLongPressTime;
        this.mEnrollingMinTemplates = config.mEnrollingMinTemplates;
        this.mValidImageQualityThreshold = config.mValidImageQualityThreshold;
        this.mValidImageAreaThreshold = config.mValidImageAreaThreshold;
        this.mDuplicateFingerOverlayScore = config.mDuplicateFingerOverlayScore;
        this.mIncreaseRateBetweenStitchInfo = config.mIncreaseRateBetweenStitchInfo;
        this.mSupportImageRescan = config.mSupportImageRescan;
        this.mRescanImageQualityThreshold = config.mRescanImageQualityThreshold;
        this.mRescanImageAreaThreshold = config.mRescanImageAreaThreshold;
        this.mRescanRetryCount = config.mRescanRetryCount;
        this.mScreenOnAuthenticateFailRetryCount = config.mScreenOnAuthenticateFailRetryCount;
        this.mScreenOffAuthenticateFailRetryCount = config.mScreenOffAuthenticateFailRetryCount;
        this.mScreenOnValidTouchFrameThreshold = config.mScreenOnValidTouchFrameThreshold;
        this.mScreenOffValidTouchFrameThreshold = config.mScreenOffValidTouchFrameThreshold;
        this.mImageQualityThresholdForMistakeTouch = config.mImageQualityThresholdForMistakeTouch;
        this.mAuthenticateOrder = config.mAuthenticateOrder;
        this.mReissueKeyDownWhenEntryFfMode = config.mReissueKeyDownWhenEntryFfMode;
        this.mReissueKeyDownWhenEntryImageMode = config.mReissueKeyDownWhenEntryImageMode;
        this.mSupportSensorBrokenCheck = config.mSupportSensorBrokenCheck;
        this.mBrokenPixelThresholdForDisableSensor = config.mBrokenPixelThresholdForDisableSensor;
        this.mBrokenPixelThresholdForDisableStudy = config.mBrokenPixelThresholdForDisableStudy;
        this.mBadPointTestMaxFrameNumber = config.mBadPointTestMaxFrameNumber;
        this.mReportKeyEventOnlyEnrollAuthenticate = config.mReportKeyEventOnlyEnrollAuthenticate;
        this.mRequireDownAndUpInPairsForImageMode = config.mRequireDownAndUpInPairsForImageMode;
        this.mRequireDownAndUpInPairsForFFMode = config.mRequireDownAndUpInPairsForFFMode;
        this.mRequireDownAndUpInPairsForKeyMode = config.mRequireDownAndUpInPairsForKeyMode;
        this.mRequireDownAndUpInPairsForNavMode = config.mRequireDownAndUpInPairsForNavMode;
        this.mSupportSetSpiSpeedInTEE = config.mSupportSetSpiSpeedInTEE;
        this.mSupportFrrAnalysis = config.mSupportFrrAnalysis;
        this.mTemplateUpateSaveThreshold = config.mTemplateUpateSaveThreshold;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(this.mChipType);
        out.writeInt(this.mChipSeries);
        out.writeInt(this.mMaxFingers);
        out.writeInt(this.mMaxFingersPerUser);
        out.writeInt(this.mSupportKeyMode);
        out.writeInt(this.mSupportFFMode);
        out.writeInt(this.mSupportPowerKeyFeature);
        out.writeInt(this.mForbiddenUntrustedEnroll);
        out.writeInt(this.mForbiddenEnrollDuplicateFingers);
        out.writeInt(this.mSupportBioAssay);
        out.writeInt(this.mSupportPerformanceDump);
        out.writeInt(this.mSupportNavMode);
        out.writeInt(this.mNavDoubleClickTime);
        out.writeInt(this.mNavLongPressTime);
        out.writeInt(this.mEnrollingMinTemplates);
        out.writeInt(this.mValidImageQualityThreshold);
        out.writeInt(this.mValidImageAreaThreshold);
        out.writeInt(this.mDuplicateFingerOverlayScore);
        out.writeInt(this.mIncreaseRateBetweenStitchInfo);
        out.writeInt(this.mSupportImageRescan);
        out.writeInt(this.mRescanImageQualityThreshold);
        out.writeInt(this.mRescanImageAreaThreshold);
        out.writeInt(this.mRescanRetryCount);
        out.writeInt(this.mScreenOnAuthenticateFailRetryCount);
        out.writeInt(this.mScreenOffAuthenticateFailRetryCount);
        out.writeInt(this.mScreenOnValidTouchFrameThreshold);
        out.writeInt(this.mScreenOffValidTouchFrameThreshold);
        out.writeInt(this.mImageQualityThresholdForMistakeTouch);
        out.writeInt(this.mAuthenticateOrder);
        out.writeInt(this.mReissueKeyDownWhenEntryFfMode);
        out.writeInt(this.mReissueKeyDownWhenEntryImageMode);
        out.writeInt(this.mSupportSensorBrokenCheck);
        out.writeInt(this.mBrokenPixelThresholdForDisableSensor);
        out.writeInt(this.mBrokenPixelThresholdForDisableStudy);
        out.writeInt(this.mBadPointTestMaxFrameNumber);
        out.writeInt(this.mReportKeyEventOnlyEnrollAuthenticate);
        out.writeInt(this.mRequireDownAndUpInPairsForImageMode);
        out.writeInt(this.mRequireDownAndUpInPairsForFFMode);
        out.writeInt(this.mRequireDownAndUpInPairsForKeyMode);
        out.writeInt(this.mRequireDownAndUpInPairsForNavMode);
        out.writeInt(this.mSupportSetSpiSpeedInTEE);
        out.writeInt(this.mSupportFrrAnalysis);
        out.writeInt(this.mTemplateUpateSaveThreshold);
    }
}
